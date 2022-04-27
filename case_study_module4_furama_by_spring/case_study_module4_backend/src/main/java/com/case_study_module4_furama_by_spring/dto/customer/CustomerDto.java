package com.case_study_module4_furama_by_spring.dto.customer;

import com.case_study_module4_furama_by_spring.model.customer.CustomerType;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CustomerDto  {

    private Integer customerId;
    @NotBlank
    @Pattern(regexp = "^$|^(KH\\-){1}[0-9]{4}$", message = "invalid code")
    private String customerCode;
    @NotBlank
    @Pattern(regexp = "^$|^[a-zA-Z]{3,}$")
    private String customerName;
    @Pattern(regexp = "^\\d{4}[\\-\\/\\s]?((((0[13578])|(1[02]))[\\-\\/\\s]?(([0-2][0-9])|(3[01])))|(((0[469])|(11))[\\-\\/\\s]?(([0-2][0-9])|(30)))|(02[\\-\\/\\s]?[0-2][0-9]))$", message = "invalid date")
    private String customerBirthday;
    private Integer customerGender;
    @Pattern(regexp = "^\\d{9}|\\d{11}$",message = "Id card must be 9 or 11 number")
    private String customerIdCard;
    @Pattern(regexp = "^(((090)|(091)|(\\+8490)|(\\+8491))\\d{7}$)",message = "correct format phone number is 090xxxxxxx or 091xxxxxxxx")
    private String customerPhone;
    @Email
    private String customerEmail;
    @NotBlank
    private String customerAddress;
    private int active = 1;


    private CustomerType customerType;

    public CustomerDto() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public Integer getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(Integer customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }


}
