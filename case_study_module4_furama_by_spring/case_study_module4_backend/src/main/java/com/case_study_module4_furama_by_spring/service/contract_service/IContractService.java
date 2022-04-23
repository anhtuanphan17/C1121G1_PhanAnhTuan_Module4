package com.case_study_module4_furama_by_spring.service.contract_service;

import com.case_study_module4_furama_by_spring.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> findAll(Pageable pageable);
}
