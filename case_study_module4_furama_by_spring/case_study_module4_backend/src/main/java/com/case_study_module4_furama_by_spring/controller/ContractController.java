package com.case_study_module4_furama_by_spring.controller;

import com.case_study_module4_furama_by_spring.dto.contract.ContractDto;
import com.case_study_module4_furama_by_spring.dto.customer.CustomerDto;
import com.case_study_module4_furama_by_spring.model.contract.Contract;
import com.case_study_module4_furama_by_spring.model.customer.Customer;
import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import com.case_study_module4_furama_by_spring.model.employee.Employee;
import com.case_study_module4_furama_by_spring.model.service_entity.ServiceEntity;
import com.case_study_module4_furama_by_spring.service.contract_service.IContractService;
import com.case_study_module4_furama_by_spring.service.customer_service.ICustomerService;
import com.case_study_module4_furama_by_spring.service.employee_service.IEmployeeService;
import com.case_study_module4_furama_by_spring.service.service_service.IServiceEntityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;


@Controller
@RequestMapping("contract")

public class ContractController {

    @Autowired
    IContractService contractService;

    @Autowired
    IEmployeeService employeeService;

    @Autowired
    ICustomerService customerService;

    @Autowired
    IServiceEntityService serviceEntityService;

    @ModelAttribute("customerList")
    public Iterable<Customer>customerList(){
      return customerService.findAll();
    }

    @ModelAttribute("employeeList")
    public Iterable<Employee> employeeList(){
        return employeeService.findAll();
    }
    @ModelAttribute("serviceEntityList")
    public Iterable<ServiceEntity> serviceEntityList(){
        return serviceEntityService.findAll();
    }


    @GetMapping("/list")
    public String showContractList(@PageableDefault(value = 2) Pageable pageable, @RequestParam Optional<String> searchWord, ModelMap modelMap) {
        String searchWordValue = searchWord.orElse("");
        Page<Contract> contractList = contractService.findAll(pageable);
        modelMap.addAttribute("contractList", contractList);
        modelMap.addAttribute("searchWordValue", searchWordValue);
        return "contract/list";
    }

    @GetMapping("create")
    public String showCreateContractForm(ModelMap modelMap){
        modelMap.addAttribute("contractDto",new ContractDto());
        return "contract/create";
    }

    @PostMapping("/create")
    public String createCustomer(@Valid @ModelAttribute ContractDto contractDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractDto, contract);
        contract.setEmployee(contractDto.getEmployee());
        contract.setCustomer(contractDto.getCustomer());
        contract.setService(contractDto.getService());
        contractService.save(contract);

        redirectAttributes.addFlashAttribute("message","added contract successfully");

        return "redirect:/contract/list";
    }


}
