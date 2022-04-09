package com.saving.saving_book_management.repository;

import com.saving.saving_book_management.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository  extends JpaRepository<Customer,Integer> {
}
