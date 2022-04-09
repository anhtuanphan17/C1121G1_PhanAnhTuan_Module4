package com.saving.saving_book_management.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDto {

    private Integer customerId;

    @NotBlank
    @Pattern(regexp = "(^$|^(C-){1}[0-9]{3,5}$)", message = "please input correct format as C-XXX")
    private String customerCode;
    @NotEmpty
    @Size(min = 2, max = 50)
    @Pattern(regexp = "(^$|^[A-Za-z ]+$)", message = "Wrong format name")
    private String customerName;

    public CustomerDto() {
    }

    public CustomerDto(String customerCode, String customerName) {
        this.customerCode = customerCode;
        this.customerName = customerName;
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
}
