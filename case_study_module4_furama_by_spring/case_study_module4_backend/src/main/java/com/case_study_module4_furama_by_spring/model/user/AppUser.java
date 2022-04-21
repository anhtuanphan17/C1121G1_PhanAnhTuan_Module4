package com.case_study_module4_furama_by_spring.model.user;


import com.case_study_module4_furama_by_spring.model.employee.Employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AppUser {

    @Id
    private String userName;
    private String encrytedPassword;


    @OneToOne(mappedBy = "appUser")
    private Employee employee;

    @OneToMany(mappedBy = "appUser")
    private Set<UserRole> userRoles;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }



}