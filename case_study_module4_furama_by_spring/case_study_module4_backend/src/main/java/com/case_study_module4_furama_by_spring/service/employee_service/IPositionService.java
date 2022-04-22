package com.case_study_module4_furama_by_spring.service.employee_service;

import com.case_study_module4_furama_by_spring.model.employee.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAllPositionList();
}
