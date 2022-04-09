package com.saving.saving_book_management.dto;

import com.saving.saving_book_management.model.SavingBook;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Set;

public class CustomerDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String customerCode;
    @Size(min = 2, max = 50)
    @Pattern(regexp = "[A-Za-z ]+", message = "Wrong format name")
    private String customerName;

    private Set<SavingBook> savingBookSet;

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

    public Set<SavingBook> getSavingBookSet() {
        return savingBookSet;
    }

    public void setSavingBookSet(Set<SavingBook> savingBookSet) {
        this.savingBookSet = savingBookSet;
    }
}
