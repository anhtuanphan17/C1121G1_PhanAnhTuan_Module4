package com.calculator.controller;

import com.calculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("list")
    public String showCalculationForm(){

        return "list";
    }

    @PostMapping("list")
    public String result(@RequestParam double num1, @RequestParam double num2, @RequestParam String calculate, Model model){
        double result = iCalculatorService.calculate(num1,num2,calculate);
        model.addAttribute("result",result);
        return "list";
    }

}
