package com.case_study_module4_furama_by_spring.service.service_service.impl;

import com.case_study_module4_furama_by_spring.model.service_entity.ServiceType;
import com.case_study_module4_furama_by_spring.repository.service_repository.IServiceTypeRepository;
import com.case_study_module4_furama_by_spring.service.service_service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService {
    @Autowired
    IServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }
}
