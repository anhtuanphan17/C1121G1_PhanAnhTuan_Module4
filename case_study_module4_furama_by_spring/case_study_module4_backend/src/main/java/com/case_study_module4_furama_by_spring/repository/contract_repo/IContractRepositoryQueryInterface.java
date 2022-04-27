package com.case_study_module4_furama_by_spring.repository.contract_repo;

import com.case_study_module4_furama_by_spring.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IContractRepositoryQueryInterface extends JpaRepository<Contract,Integer> {

    @Query(value = "select customer.customer_name as customerName, service_entity.service_name as serviceName, service_entity.service_cost as serviceCost, contract.contract_deposit as contractDeposit, attach_service.attach_service_name as attachServiceName,attach_service.attach_service_cost as attachServiceCost, contract_detail.quantity as contractDetailQuantity " +
            ", ( ifnull(service_entity.service_cost,0) - ifnull(contract.contract_deposit,0) +( ifnull(attach_service.attach_service_cost,0) * ifnull(contract_detail.quantity,0)) ) as totalMoney " +
            "from contract " +
            " join customer on customer.customer_id = contract.customer_id " +
            " join service_entity on service_entity.service_id = contract.service_id " +
            " left join contract_detail on contract_detail.contract_id = contract.contract_id " +
            " left join attach_service on attach_service.attach_service_id = contract_detail.attact_service_id",nativeQuery = true)
<T> List<T> findCustomerUsingService(Class<T> classType);

}
