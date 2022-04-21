package com.case_study_module4_furama_by_spring.model.contract;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractDetail;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "attact_service_id",referencedColumnName = "attachServiceId")
    private AttachService attachService;

    @ManyToOne
    @JoinColumn(name = "contract_id",referencedColumnName = "contractId")
    private Contract contract;

    public ContractDetail() {
    }

    public Integer getContractDetail() {
        return contractDetail;
    }

    public void setContractDetail(Integer contractDetail) {
        this.contractDetail = contractDetail;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
