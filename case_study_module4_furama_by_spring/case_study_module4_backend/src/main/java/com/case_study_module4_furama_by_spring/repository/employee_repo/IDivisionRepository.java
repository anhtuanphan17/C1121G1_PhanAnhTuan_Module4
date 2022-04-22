package com.case_study_module4_furama_by_spring.repository.employee_repo;

import com.case_study_module4_furama_by_spring.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division,Integer> {
}
