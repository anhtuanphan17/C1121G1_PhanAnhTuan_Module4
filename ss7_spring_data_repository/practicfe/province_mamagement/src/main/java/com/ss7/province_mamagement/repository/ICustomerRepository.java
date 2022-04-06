package com.ss7.province_mamagement.repository;

import com.ss7.province_mamagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
