package com.validate_email.controller;

import com.validate_email.service.ICheckValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @Autowired
    private ICheckValidate iCheckValidate ;


    @GetMapping("/")
    String getIndex(){
        return "index";
    }

    @PostMapping("validate")
        String returnResult(@RequestParam String email, Model model){
        String result = iCheckValidate.checkValidate(email);

        model.addAttribute("result",result);
        return "result";
        }

}
