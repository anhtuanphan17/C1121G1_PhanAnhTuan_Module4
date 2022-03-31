package com.medical_declaration.controller;

import com.medical_declaration.model.MedicalDeclaration;
import com.medical_declaration.service.IMedicalDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MedicalDeclarationController {

    @Autowired
    IMedicalDeclarationService iMedicalDeclarationService;

    @GetMapping("declaration")
    public String goDeclarationForm(ModelMap model) {

        List<String> nationList = iMedicalDeclarationService.getAllNation();
        List<String> genderList = iMedicalDeclarationService.getAllGender();
        List<String> provinceList = iMedicalDeclarationService.getAllProvince();
        List<String> districtList = iMedicalDeclarationService.getAllDistrict();
        List<String> wardList = iMedicalDeclarationService.getAllWard();

        List<String> vehicleList = iMedicalDeclarationService.getAllVehicle();

        model.addAttribute("nationList", nationList);
        model.addAttribute("genderList", genderList);
        model.addAttribute("provinceList", provinceList);
        model.addAttribute("districtList", districtList);
        model.addAttribute("wardList", wardList);

        model.addAttribute("medicalDeclaration", new MedicalDeclaration());
        model.addAttribute("vehicleList", vehicleList);


        return "declaration_file";
    }

    @PostMapping("/declaration")
    public String khaiBaoYTe(@ModelAttribute MedicalDeclaration medicalDeclaration, Model model) {
        iMedicalDeclarationService.save(medicalDeclaration);
        model.addAttribute("medicalDeclaration", medicalDeclaration);
        model.addAttribute("mess", "thành công");

        List<String> nationList = iMedicalDeclarationService.getAllNation();
        List<String> genderList = iMedicalDeclarationService.getAllGender();
        List<String> provinceList = iMedicalDeclarationService.getAllProvince();
        List<String> districtList = iMedicalDeclarationService.getAllDistrict();
        List<String> wardList = iMedicalDeclarationService.getAllWard();

        List<String> vehicleList = iMedicalDeclarationService.getAllVehicle();


        model.addAttribute("nationList", nationList);
        model.addAttribute("genderList", genderList);
        model.addAttribute("provinceList", provinceList);
        model.addAttribute("districtList", districtList);
        model.addAttribute("wardList", wardList);

        model.addAttribute("vehicleList", vehicleList);

        return "declaration_file";
    }

}
