package com.case_study_module4_furama_by_spring.service.employee_service.impl;

import com.case_study_module4_furama_by_spring.model.employee.EducationDegree;
import com.case_study_module4_furama_by_spring.repository.employee_repo.IEducationDegreeRepository;
import com.case_study_module4_furama_by_spring.service.employee_service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {

    @Autowired
    IEducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAllEducationDegreeList() {
        return educationDegreeRepository.findAll();
    }
}
