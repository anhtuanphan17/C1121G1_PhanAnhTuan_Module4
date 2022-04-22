package com.case_study_module4_furama_by_spring.controller;

import com.case_study_module4_furama_by_spring.dto.customer.CustomerDto;
import com.case_study_module4_furama_by_spring.model.customer.Customer;
import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import com.case_study_module4_furama_by_spring.model.service_entity.RentType;
import com.case_study_module4_furama_by_spring.model.service_entity.ServiceEntity;
import com.case_study_module4_furama_by_spring.model.service_entity.ServiceType;
import com.case_study_module4_furama_by_spring.service.service_service.IRentTypeService;
import com.case_study_module4_furama_by_spring.service.service_service.IServiceEntityService;
import com.case_study_module4_furama_by_spring.service.service_service.IServiceTypeService;
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
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "service")
public class ServiceController {

    @Autowired
    IServiceEntityService serviceService;
    @Autowired
    IRentTypeService rentTypeService;
    @Autowired
    IServiceTypeService serviceTypeService;

    @ModelAttribute("rentTypeList")
    public List<RentType> rentTypeList (){
        return rentTypeService.findAll();
    }

    @ModelAttribute("serviceTypeList")
    public List<ServiceType> serviceTypeList(){
        return serviceTypeService.findAll();
    }

    @GetMapping("/list")
    public String showCustomerList(@PageableDefault(value = 2) Pageable pageable, @RequestParam Optional<String> searchWord, ModelMap modelMap) {
        String searchWordValue = searchWord.orElse("");
        Page<ServiceEntity> serviceList = serviceService.findAll(pageable);
        modelMap.addAttribute("serviceList", serviceList);
        modelMap.addAttribute("searchWordValue", searchWordValue);
        return "service/list";
    }
//
//    @PostMapping("/create")
//    public String createCustomer(@Valid @ModelAttribute CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
//        Customer customer = new Customer();
//        BeanUtils.copyProperties(customerDto, customer);
//        CustomerType customerType = new CustomerType();
//        customerType.setCustomerTypeId(customerDto.getCustomerType().getCustomerTypeId());
//        customerType.setCustomerTypeName(customerDto.getCustomerType().getCustomerTypeName());
//        customer.setCustomerType(customerType);
//        customerService.save(customer);
//        redirectAttributes.addFlashAttribute("message","added customer successfully");
//
//        return "redirect:/customer/list";
//    }

}
