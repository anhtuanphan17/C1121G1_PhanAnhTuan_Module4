package com.case_study_module4_furama_by_spring.repository.service_repo;

import com.case_study_module4_furama_by_spring.model.service_entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceEntityRepository extends JpaRepository<ServiceEntity,Integer> {
}
