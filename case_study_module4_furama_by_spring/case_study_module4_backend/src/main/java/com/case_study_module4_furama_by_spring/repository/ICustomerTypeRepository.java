package com.case_study_module4_furama_by_spring.repository;

import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
