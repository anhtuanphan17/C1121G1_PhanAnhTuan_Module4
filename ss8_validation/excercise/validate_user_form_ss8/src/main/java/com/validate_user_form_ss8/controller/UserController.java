package com.validate_user_form_ss8.controller;

import com.validate_user_form_ss8.dto.UserDto;
import com.validate_user_form_ss8.model.User;
import com.validate_user_form_ss8.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/user")
    public String showForm(ModelMap modelMap){
        modelMap.addAttribute("userDto",new UserDto());
        return "input-form";
    }

    @PostMapping("/validateUser")
    public String validateUser(@Valid @ModelAttribute UserDto userDto,
                               BindingResult bindingResult,
                               ModelMap modelMap){

        userDto.validate(userDto,bindingResult);

        if(bindingResult.hasFieldErrors()){
            return "input-form";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        userService.save(user);
        modelMap.addAttribute("userList",this.userService.findAll());

        return "result";
    }

}
