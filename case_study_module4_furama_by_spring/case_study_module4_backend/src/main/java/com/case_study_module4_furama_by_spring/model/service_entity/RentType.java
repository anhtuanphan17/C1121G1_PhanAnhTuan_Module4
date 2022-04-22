package com.case_study_module4_furama_by_spring.model.service_entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentTypeId;
    private String rentTypeName;
    private String rentTypeCost;

    @OneToMany(mappedBy = "rentType")
    private Set<ServiceEntity> serviceSet;


    public RentType() {
    }

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public String getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(String rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    public Set<ServiceEntity> getServiceSet() {
        return serviceSet;
    }

    public void setServiceSet(Set<ServiceEntity> serviceSet) {
        this.serviceSet = serviceSet;
    }
}
