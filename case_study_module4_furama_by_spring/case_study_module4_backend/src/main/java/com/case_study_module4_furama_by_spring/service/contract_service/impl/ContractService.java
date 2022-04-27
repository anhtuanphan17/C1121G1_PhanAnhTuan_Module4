package com.case_study_module4_furama_by_spring.service.contract_service.impl;

import com.case_study_module4_furama_by_spring.model.contract.Contract;
import com.case_study_module4_furama_by_spring.model.contract.ICustomerUserService;
import com.case_study_module4_furama_by_spring.repository.contract_repo.IContractRepositoryQueryInterface;
import com.case_study_module4_furama_by_spring.repository.service_repo.IContractRepository;
import com.case_study_module4_furama_by_spring.service.contract_service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    IContractRepositoryQueryInterface contractRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public List<ICustomerUserService> findCustomerUsingService() {
        return contractRepository.findCustomerUsingService(ICustomerUserService.class)  ;
    }


}
