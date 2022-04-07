package com.validate_user_form_ss8.dto;

import com.validate_user_form_ss8.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class UserDto implements Validator {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @NotBlank(message = "please input correct name")
        @Size(min = 3,max = 30,message = "please input correct name")
        @Pattern(regexp = "[A-Za-z ]+")
        private String firstName;
        @NotBlank(message = "please input correct name")
        @Size(min = 3,max = 30,message = ( "please input correct name"))
        @Pattern(regexp = "[A-Za-z ]+")
        private String lastName;
        @Pattern(regexp = "((09|03|07|08|05)+([0-9]{8}))",message = "please input correct phone number")
        private String phoneNumber;

        private String dateOfBirth;
        @Email()
        private String email;

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        Integer yearOfUser = Integer.valueOf(userDto.getDateOfBirth().substring(0,4));

        Integer yearCurrent = LocalDate.now().getYear();
        if((yearCurrent-yearOfUser)<18){
            errors.rejectValue("dateOfBirth","dateOfBirth.not18","Age is not higher than 18");
        }

    }
}
