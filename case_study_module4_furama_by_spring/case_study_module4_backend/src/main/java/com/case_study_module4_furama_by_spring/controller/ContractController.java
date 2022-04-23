package com.case_study_module4_furama_by_spring.controller;

import com.case_study_module4_furama_by_spring.model.contract.Contract;
import com.case_study_module4_furama_by_spring.model.customer.Customer;
import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import com.case_study_module4_furama_by_spring.service.contract_service.IContractService;
import com.case_study_module4_furama_by_spring.service.customer_service.ICustomerService;
import com.case_study_module4_furama_by_spring.service.customer_service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("contract")

public class ContractController {

    @Autowired
    IContractService contractService;

    @GetMapping("/list")
    public String showContractList(@PageableDefault(value = 2) Pageable pageable, @RequestParam Optional<String> searchWord, ModelMap modelMap) {
        String searchWordValue = searchWord.orElse("");
        Page<Contract> contractList = contractService.findAll(pageable);
        modelMap.addAttribute("contractList", contractList);
        modelMap.addAttribute("searchWordValue", searchWordValue);
        return "contract/list";
    }



}
