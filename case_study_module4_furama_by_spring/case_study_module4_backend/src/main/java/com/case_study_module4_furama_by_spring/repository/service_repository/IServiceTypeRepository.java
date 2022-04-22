package com.case_study_module4_furama_by_spring.repository.service_repository;

import com.case_study_module4_furama_by_spring.model.service_entity.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceTypeRepository extends JpaRepository<ServiceType,Integer> {
}
