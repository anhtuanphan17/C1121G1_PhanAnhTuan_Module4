package com.case_study_module4_furama_by_spring.service.impl;

import com.case_study_module4_furama_by_spring.model.customer.Customer;
import com.case_study_module4_furama_by_spring.repository.ICustomerRepository;
import com.case_study_module4_furama_by_spring.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public Page<Customer> findALlCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }
}
