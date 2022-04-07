package com.validate_user_form_ss8.repository;

import com.validate_user_form_ss8.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
