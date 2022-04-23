package com.case_study_module4_furama_by_spring.service.service_service.impl;

import com.case_study_module4_furama_by_spring.model.service_entity.ServiceEntity;
import com.case_study_module4_furama_by_spring.repository.service_repo.IServiceEntityRepository;
import com.case_study_module4_furama_by_spring.service.service_service.IServiceEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ServiceEntityService implements IServiceEntityService {

    @Autowired
    IServiceEntityRepository serviceEntityRepository;
    @Override
    public Page<ServiceEntity> findAll(Pageable pageable) {
        return serviceEntityRepository.findAll(pageable);
    }

    @Override
    public void save(ServiceEntity serviceEntity) {
        serviceEntityRepository.save(serviceEntity);
    }
}
