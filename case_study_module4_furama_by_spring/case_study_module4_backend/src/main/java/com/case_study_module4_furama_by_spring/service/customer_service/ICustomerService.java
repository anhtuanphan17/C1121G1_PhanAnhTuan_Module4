package com.case_study_module4_furama_by_spring.service.customer_service;

import com.case_study_module4_furama_by_spring.model.customer.Customer;
import com.case_study_module4_furama_by_spring.model.customer.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findALlCustomer(Pageable pageable);


    void save(Customer customer);

    Customer findCustomerById(Integer id);

    void remove(Customer customer);
}
