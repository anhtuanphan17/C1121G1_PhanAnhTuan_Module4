package com.case_study_module4_furama_by_spring.controller;

import com.case_study_module4_furama_by_spring.dto.customer.CustomerDto;
import com.case_study_module4_furama_by_spring.model.customer.Customer;
import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import com.case_study_module4_furama_by_spring.service.ICustomerService;
import com.case_study_module4_furama_by_spring.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("customer")

public class CustomerController {

    @Autowired
    ICustomerService customerService;
    @Autowired
    ICustomerTypeService customerTypeService;

    @GetMapping("/list")
   public String showCustomerList(@PageableDefault(value = 2)Pageable pageable,@RequestParam Optional<String> searchWord, ModelMap modelMap){
        String searchWordValue = searchWord.orElse("");
        Page<Customer> customerList = customerService.findALlCustomer(pageable);
        modelMap.addAttribute("customerList",customerList);
        modelMap.addAttribute("searchWordValue",searchWordValue);
        return "customer/list";
    }

    @GetMapping("/create")
    public String showCreateForm(ModelMap modelMap){
        modelMap.addAttribute("customerDto",new CustomerDto());

        List<CustomerType> customerTypeList = customerTypeService.findALlCustomerType();
        modelMap.addAttribute("customerTypeList",customerTypeList);
        return "customer/create";
    }










}
