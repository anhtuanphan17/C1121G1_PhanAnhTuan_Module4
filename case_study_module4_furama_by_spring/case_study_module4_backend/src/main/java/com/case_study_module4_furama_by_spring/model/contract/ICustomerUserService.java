package com.case_study_module4_furama_by_spring.model.contract;

public interface ICustomerUserService {
    String getCustomerName();

    String getServiceName();

    Double getServiceCost();

    Double getContractDeposit();

    String getAttachServiceName();

    Double getAttachServiceCost();

    Integer getContractDetailQuantity();

    Double getTotalMoney();
}
