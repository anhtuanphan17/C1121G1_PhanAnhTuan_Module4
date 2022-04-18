package com.customer_management_use_i18n.repository;

import com.customer_management_use_i18n.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
}
