package com.medical_declaration.repo;

import com.medical_declaration.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalDeclarationRepo {
    List<String> getAllNation();
    List<String> getAllGender();
    List<String> getAllProvince();
    List<String> getAllDistrict();
    List<String> getAllWard();
    List<String> getAllVehicle();

    void save(MedicalDeclaration medicalDeclaration);
}

