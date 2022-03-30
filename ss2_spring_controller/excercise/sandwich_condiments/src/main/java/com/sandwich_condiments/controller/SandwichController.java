package com.sandwich_condiments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {

    @GetMapping("list")
    public String showList(){

        return "list";
    }

    @PostMapping("result")
    public ModelAndView selectedCondiments(@RequestParam String[] condiments){
        ModelAndView modelAndView = new ModelAndView("result");
       String result ="";
        for(String condiment:condiments){
           result += condiment +",";
        }
        modelAndView.addObject("result",result);

        return modelAndView;
    }

}
