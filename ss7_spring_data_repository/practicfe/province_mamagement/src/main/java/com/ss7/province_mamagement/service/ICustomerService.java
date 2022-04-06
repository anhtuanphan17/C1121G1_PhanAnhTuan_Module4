package com.ss7.province_mamagement.service;


import com.ss7.province_mamagement.model.Customer;
import com.ss7.province_mamagement.model.Province;

import java.util.List;

public interface ICustomerService  {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    List<Customer> findAllByProvince(Province province);
}
