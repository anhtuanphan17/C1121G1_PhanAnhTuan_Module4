package com.case_study_module4_furama_by_spring.service.customer_service.impl;

import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import com.case_study_module4_furama_by_spring.repository.customer_repo.ICustomerTypeRepository;
import com.case_study_module4_furama_by_spring.service.customer_service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    ICustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findALlCustomerType() {
        return customerTypeRepository.findAll();
    }
}

