package com.saving.saving_book_management.service;

import com.saving.saving_book_management.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
