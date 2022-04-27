package com.case_study_module4_furama_by_spring.repository.customer_repo;

import com.case_study_module4_furama_by_spring.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

    Page<Customer> findCustomerByCustomerNameContaining(String searchWord,Pageable pageable);
}
