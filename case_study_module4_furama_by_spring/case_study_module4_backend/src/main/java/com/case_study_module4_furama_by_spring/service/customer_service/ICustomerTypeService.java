package com.case_study_module4_furama_by_spring.service.customer_service;

import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ICustomerTypeService {
    List<CustomerType> findALlCustomerType();
}
