package com.validate_user_form_ss8.service;

import com.validate_user_form_ss8.model.User;

import java.util.List;

public interface IUserService {
    void save(User user);

    List<User> findAll();
}
