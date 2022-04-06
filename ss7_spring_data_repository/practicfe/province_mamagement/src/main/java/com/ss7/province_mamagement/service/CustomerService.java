package com.ss7.province_mamagement.service;


import com.ss7.province_mamagement.model.Customer;
import com.ss7.province_mamagement.model.Province;
import com.ss7.province_mamagement.repository.ICustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return iCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAllByProvince(Province province) {
//        return iCustomerRepository.findCustomerByProvince(province);
        return null;
    }
}