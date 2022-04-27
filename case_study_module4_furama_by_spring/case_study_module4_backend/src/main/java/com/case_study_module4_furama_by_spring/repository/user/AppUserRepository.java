package com.case_study_module4_furama_by_spring.repository.user;

import com.case_study_module4_furama_by_spring.model.user.AppUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {

    AppUser findByUserName(String userName);
}
