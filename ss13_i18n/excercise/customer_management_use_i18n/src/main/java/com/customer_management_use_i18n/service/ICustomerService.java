package com.customer_management_use_i18n.service;

import com.customer_management_use_i18n.model.Customer;
import com.customer_management_use_i18n.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);
}
