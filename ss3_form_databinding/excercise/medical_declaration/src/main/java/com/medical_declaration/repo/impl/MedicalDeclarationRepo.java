package com.medical_declaration.repo.impl;

import com.medical_declaration.model.MedicalDeclaration;
import com.medical_declaration.repo.IMedicalDeclarationRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalDeclarationRepo implements IMedicalDeclarationRepo {

    private static List<String> nationList = new ArrayList<>();
    private static List<String> genderList = new ArrayList<>();
    private static List<String> provinceList = new ArrayList<>();
    private static List<String> districtList = new ArrayList<>();
    private static List<String> wardList = new ArrayList<>();
    //        private static List<Integer> coKhong = new ArrayList<>();
    private static List<MedicalDeclaration> medicalDeclarationList = new ArrayList<>();
    private static List<String> vehicleList = new ArrayList<>();


    static {
        nationList.add("Việt Nam");
        nationList.add("Khác");

        genderList.add("Nam");
        genderList.add("Nữ");

        provinceList.add("Đà Nang");

        districtList.add("Liên Chiểu");
        districtList.add("Cẩm Lệ");
        districtList.add("Hải Châu");

        wardList.add("Hoà Minh");
        wardList.add("Hoà Khánh");
        wardList.add("Hoà Vang");
        wardList.add("Thạch Thang");


        vehicleList.add("Ô Tô");
        vehicleList.add("Xe Máy");
        vehicleList.add("Xe Khách");
        vehicleList.add("Khác");
    }


    @Override
    public List<String> getAllNation() {
        return nationList;
    }

    @Override
    public List<String> getAllGender() {
        return genderList;
    }

    @Override
    public List<String> getAllProvince() {
        return provinceList;
    }

    @Override
    public List<String> getAllDistrict() {
        return districtList;
    }

    @Override
    public List<String> getAllWard() {
        return wardList;
    }

    @Override
    public List<String> getAllVehicle() {
        return vehicleList;
    }

    @Override
    public void save(MedicalDeclaration medicalDeclaration) {
        medicalDeclarationList.add(medicalDeclaration);
    }

}
