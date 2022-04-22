package com.case_study_module4_furama_by_spring.service.service_service;

import com.case_study_module4_furama_by_spring.model.service_entity.ServiceType;

import java.util.List;

public interface IServiceTypeService {
    List<ServiceType> findAll();
}
