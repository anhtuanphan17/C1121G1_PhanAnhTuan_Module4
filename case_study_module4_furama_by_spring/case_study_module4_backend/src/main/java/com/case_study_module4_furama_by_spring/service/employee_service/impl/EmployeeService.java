package com.case_study_module4_furama_by_spring.service.employee_service.impl;

import com.case_study_module4_furama_by_spring.model.employee.Employee;
import com.case_study_module4_furama_by_spring.repository.employee_repo.IEmployeeRepository;
import com.case_study_module4_furama_by_spring.service.employee_service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
