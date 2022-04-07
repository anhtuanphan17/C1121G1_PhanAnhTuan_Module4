package com.validate_user_form_ss8.service;

import com.validate_user_form_ss8.model.User;
import com.validate_user_form_ss8.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    IUserRepository userRepository;

    @Override
    public void save(User user) {
    userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
       return userRepository.findAll();
    }
}
