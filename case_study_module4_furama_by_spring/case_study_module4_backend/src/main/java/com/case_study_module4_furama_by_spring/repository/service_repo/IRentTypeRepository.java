package com.case_study_module4_furama_by_spring.repository.service_repo;

import com.case_study_module4_furama_by_spring.model.service_entity.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentTypeRepository extends JpaRepository<RentType,Integer> {
}
