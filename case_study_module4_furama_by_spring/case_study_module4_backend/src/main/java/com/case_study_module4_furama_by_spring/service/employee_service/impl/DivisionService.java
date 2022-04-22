package com.case_study_module4_furama_by_spring.service.employee_service.impl;

import com.case_study_module4_furama_by_spring.model.employee.Division;
import com.case_study_module4_furama_by_spring.repository.employee_repo.IDivisionRepository;
import com.case_study_module4_furama_by_spring.service.employee_service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    IDivisionRepository divisionRepository;

    @Override
    public List<Division> findAllDivisionList() {
        return divisionRepository.findAll();
    }
}
