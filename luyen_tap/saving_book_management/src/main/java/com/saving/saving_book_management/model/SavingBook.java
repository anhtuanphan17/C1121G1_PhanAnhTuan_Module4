package com.saving.saving_book_management.model;

import javax.persistence.*;

@Entity
public class SavingBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer savingBookId;
    private String savingBookCode;
    private String startDay;
    private Integer term;
    private Integer amount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="customer_id",referencedColumnName = "customerId")
    private Customer customer;

    public SavingBook() {
    }

    public Integer getSavingBookId() {
        return savingBookId;
    }

    public void setSavingBookId(Integer savingBookId) {
        this.savingBookId = savingBookId;
    }

    public String getSavingBookCode() {
        return savingBookCode;
    }

    public void setSavingBookCode(String savingBookCode) {
        this.savingBookCode = savingBookCode;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
