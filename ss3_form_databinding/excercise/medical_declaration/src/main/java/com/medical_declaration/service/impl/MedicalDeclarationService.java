package com.medical_declaration.service.impl;

import com.medical_declaration.model.MedicalDeclaration;
import com.medical_declaration.repo.IMedicalDeclarationRepo;
import com.medical_declaration.service.IMedicalDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalDeclarationService implements IMedicalDeclarationService {

    @Autowired
    private IMedicalDeclarationRepo iMedicalDeclarationRepo;

    @Override
    public List<String> getAllNation() {
        return iMedicalDeclarationRepo.getAllNation();
    }

    @Override
    public List<String> getAllGender() {
        return iMedicalDeclarationRepo.getAllGender();
    }

    @Override
    public List<String> getAllProvince() {
        return iMedicalDeclarationRepo.getAllProvince();
    }

    @Override
    public List<String> getAllDistrict() {
        return iMedicalDeclarationRepo.getAllDistrict();
    }

    @Override
    public List<String> getAllWard() {
        return iMedicalDeclarationRepo.getAllWard();
    }

    @Override
    public List<String> getAllVehicle() {
        return iMedicalDeclarationRepo.getAllVehicle();
    }

    @Override
    public void save(MedicalDeclaration medicalDeclaration) {
    iMedicalDeclarationRepo.save(medicalDeclaration);
    }
}
