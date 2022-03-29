package com.convert_currency.controller;

import com.convert_currency.service.IConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertCurrencyController {
    @Autowired
    private IConvert convert;

    @GetMapping("/convert")
    public String convert(){
        return "list";
    }

    @PostMapping("/convert")
    public String result(@RequestParam(name="usd") double a, Model model){
        double result = convert.convert(a);
        model.addAttribute("result",result);
        return "list";
    }


}
