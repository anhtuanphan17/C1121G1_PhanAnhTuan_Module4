package com.validate_email.service.impl;

import com.validate_email.service.ICheckValidate;
import org.springframework.stereotype.Service;

@Service
public class CheckValidate implements ICheckValidate {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    @Override
    public String checkValidate(String email) {
        String result=null;
        Boolean valid;
        valid = email.matches(EMAIL_REGEX);
        if(valid){
            result = "email is valid";
        }else{
            result = "email is invalid";
        }

        return result;
    }
}
