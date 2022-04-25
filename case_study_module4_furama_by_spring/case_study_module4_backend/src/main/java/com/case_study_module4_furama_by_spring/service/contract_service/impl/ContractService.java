package com.case_study_module4_furama_by_spring.service.contract_service.impl;

import com.case_study_module4_furama_by_spring.model.contract.Contract;
import com.case_study_module4_furama_by_spring.repository.service_repo.IContractRepository;
import com.case_study_module4_furama_by_spring.service.contract_service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {
    @Autowired
    IContractRepository contractRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }
}
