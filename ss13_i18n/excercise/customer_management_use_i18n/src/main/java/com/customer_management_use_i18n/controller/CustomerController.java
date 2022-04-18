package com.customer_management_use_i18n.controller;

import com.customer_management_use_i18n.model.Customer;
import com.customer_management_use_i18n.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String listCustomer(ModelMap modelMap) {
        List<Customer> customerList = customerService.findAll();
        modelMap.addAttribute("customerList", customerList);
        return "list";
    }

    @GetMapping("/create")
    public String createForm(ModelMap modelMap) {
        modelMap.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/create")
    public String createCustomer(@ModelAttribute Customer customer) {
        customerService.save(customer);
        return "redirect:/customer";
    }

}
