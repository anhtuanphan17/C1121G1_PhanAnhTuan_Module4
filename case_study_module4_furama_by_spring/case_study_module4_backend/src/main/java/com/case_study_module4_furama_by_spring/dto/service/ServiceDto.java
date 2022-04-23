package com.case_study_module4_furama_by_spring.dto.service;

import com.case_study_module4_furama_by_spring.model.service_entity.RentType;
import com.case_study_module4_furama_by_spring.model.service_entity.ServiceType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ServiceDto {
    private Integer serviceId;
    private String serviceCode;
    private String serviceName;
    private Integer serviceArea;
    private Double serviceCost;
    private Integer serviceMaxPeople;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private Double poolArea;
    private Integer numberOfFloors;
    private String freeServiceInclude;


    private RentType rentType;

    private ServiceType serviceType;
}
