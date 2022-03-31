package com.medical_declaration.controller;

import com.medical_declaration.model.MedicalDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class MedicalDeclarationController {


    @GetMapping("declaration")
    public String goDeclarationForm(ModelMap modelMap){
    modelMap.addAttribute("medicalDeclaration",new MedicalDeclaration());


        return "declaration_file";
    }




}
