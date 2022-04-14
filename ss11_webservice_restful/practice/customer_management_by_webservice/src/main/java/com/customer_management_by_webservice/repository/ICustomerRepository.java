package com.customer_management_by_webservice.repository;

import com.customer_management_by_webservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
