package com.saving.saving_book_management.dto;

import com.saving.saving_book_management.model.Customer;
import com.saving.saving_book_management.model.SavingBook;
import org.springframework.cglib.core.Local;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SavingBookDto implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer savingBookId;
    @Size(min = 4,message = "wrong saving book code")
    private String savingBookCode;
    private String startDay;
    private Integer term;
    private Integer amount;

    @Valid
    private Customer customer;

    public SavingBookDto() {
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        SavingBookDto savingBookDto = (SavingBookDto) target;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate now =  LocalDate.now();
        LocalDate startDay = LocalDate.parse(savingBookDto.getStartDay(),formatter);

       if(startDay.isBefore(now)){
           errors.rejectValue("startDay","wrong.startday","Please choose correct start day ");

       }
    }



}