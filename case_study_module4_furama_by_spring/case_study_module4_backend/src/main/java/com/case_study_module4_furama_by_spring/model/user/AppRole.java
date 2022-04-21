package com.case_study_module4_furama_by_spring.model.user;


import javax.persistence.*;
import java.util.Set;

@Entity
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    private String roleName;

    @OneToMany(mappedBy = "appRole")
    private Set<UserRole> userRoles;

}