package com.case_study_module4_furama_by_spring.repository.user;

import com.case_study_module4_furama_by_spring.model.user.AppUser;
import com.case_study_module4_furama_by_spring.model.user.UserRole;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
