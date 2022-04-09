package com.saving.saving_book_management.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    private String customerCode;
    private String customerName;

    @OneToMany(mappedBy = "customer")
    private Set<SavingBook> savingBookSet;

    public Customer() {
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
