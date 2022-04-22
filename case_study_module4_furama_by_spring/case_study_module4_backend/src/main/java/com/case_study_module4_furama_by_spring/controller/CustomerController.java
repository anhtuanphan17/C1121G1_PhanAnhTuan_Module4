package com.case_study_module4_furama_by_spring.controller;

import com.case_study_module4_furama_by_spring.dto.customer.CustomerDto;
import com.case_study_module4_furama_by_spring.model.customer.Customer;
import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import com.case_study_module4_furama_by_spring.service.customer_service.ICustomerService;
import com.case_study_module4_furama_by_spring.service.customer_service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("customer")

public class CustomerController {

    @Autowired
    ICustomerService customerService;
    @Autowired
    ICustomerTypeService customerTypeService;

    @ModelAttribute("customerTypeList")
    public List<CustomerType> customerType() {
        return customerTypeService.findALlCustomerType();
    }

    @GetMapping("/list")
    public String showCustomerList(@PageableDefault(value = 2) Pageable pageable, @RequestParam Optional<String> searchWord, ModelMap modelMap) {
        String searchWordValue = searchWord.orElse("");
        Page<Customer> customerList = customerService.findALlCustomer(pageable);
        modelMap.addAttribute("customerList", customerList);
        modelMap.addAttribute("searchWordValue", searchWordValue);
        return "customer/list";
    }

    @GetMapping("/create")
    public String showCreateForm(ModelMap modelMap) {
        modelMap.addAttribute("customerDto", new CustomerDto());
//        List<CustomerType> customerTypeList = customerTypeService.findALlCustomerType();
//        modelMap.addAttribute("customerTypeList",customerTypeList);
        return "customer/create";
    }

    @PostMapping("/create")
    public String createCustomer(@Valid @ModelAttribute CustomerDto customerDto, BindingResult bindingResult) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        CustomerType customerType = new CustomerType();
        customerType.setCustomerTypeId(customerDto.getCustomerType().getCustomerTypeId());
        customerType.setCustomerTypeName(customerDto.getCustomerType().getCustomerTypeName());
        customer.setCustomerType(customerType);
        customerService.save(customer);

        return "redirect:/customer/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, ModelMap modelMap) {
        Customer customer = customerService.findCustomerById(id);
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customer, customerDto);
        CustomerType customerType = new CustomerType();
        customerType.setCustomerTypeId(customer.getCustomerType().getCustomerTypeId());
        customerType.setCustomerTypeName(customer.getCustomerType().getCustomerTypeName());
        customerDto.setCustomerType(customerType);
        modelMap.addAttribute("customerDto", customerDto);
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String editCustomer(@Valid @ModelAttribute CustomerDto customerDto,BindingResult bindingResult){
    Customer customer = new Customer();
    BeanUtils.copyProperties(customerDto,customer);
    CustomerType customerType = new CustomerType();
    customerType.setCustomerTypeId(customerDto.getCustomerType().getCustomerTypeId());
    customerType.setCustomerTypeName(customerDto.getCustomerType().getCustomerTypeName());
    customer.setCustomerType(customerType);
    customerService.save(customer);
    return "redirect:/customer/list";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(@PathVariable Integer id, ModelMap modelMap){
        Customer customer = customerService.findCustomerById(id);
        modelMap.addAttribute("customer",customer);
        return "customer/delete";

    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute Customer customer){
        customerService.remove(customer);
        return "redirect:/customer/list";
    }


}
