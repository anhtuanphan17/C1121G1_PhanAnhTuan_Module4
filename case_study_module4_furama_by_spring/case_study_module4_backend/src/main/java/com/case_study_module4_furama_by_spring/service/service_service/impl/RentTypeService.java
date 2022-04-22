package com.case_study_module4_furama_by_spring.service.service_service.impl;

import com.case_study_module4_furama_by_spring.model.service_entity.RentType;
import com.case_study_module4_furama_by_spring.repository.service_repository.IRentTypeRepository;
import com.case_study_module4_furama_by_spring.service.service_service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    IRentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
