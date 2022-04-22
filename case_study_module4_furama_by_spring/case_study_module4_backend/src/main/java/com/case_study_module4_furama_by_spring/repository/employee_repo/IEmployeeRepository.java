package com.case_study_module4_furama_by_spring.repository.employee_repo;

import com.case_study_module4_furama_by_spring.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
}
