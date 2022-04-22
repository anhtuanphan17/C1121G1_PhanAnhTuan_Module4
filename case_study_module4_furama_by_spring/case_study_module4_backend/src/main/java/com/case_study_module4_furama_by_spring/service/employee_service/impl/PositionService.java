package com.case_study_module4_furama_by_spring.service.employee_service.impl;

import com.case_study_module4_furama_by_spring.model.employee.Position;
import com.case_study_module4_furama_by_spring.repository.employee_repo.IPositionRepository;
import com.case_study_module4_furama_by_spring.service.employee_service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    IPositionRepository positionRepository;

    @Override
    public List<Position> findAllPositionList() {
        return positionRepository.findAll();
    }
}
