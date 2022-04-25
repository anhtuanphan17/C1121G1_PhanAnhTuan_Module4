package com.case_study_module4_furama_by_spring.service.employee_service;

import com.case_study_module4_furama_by_spring.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {
    Page<Employee> findAllEmployee(Pageable pageable);

    void save(Employee employee);

    Employee findEmployeeById(Integer id);

    Iterable<Employee> findAll();
}
