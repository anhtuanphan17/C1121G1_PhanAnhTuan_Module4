package com.case_study_module4_furama_by_spring.service.service_service;

import com.case_study_module4_furama_by_spring.model.service_entity.ServiceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IServiceEntityService {
    Page<ServiceEntity> findAll(Pageable pageable);

    void save(ServiceEntity serviceEntity);

    Iterable<ServiceEntity> findAll();
}
