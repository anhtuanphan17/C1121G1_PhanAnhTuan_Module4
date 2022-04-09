package com.saving.saving_book_management.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SavingBookDto implements Validator {

    private Integer savingBookId;

    @NotEmpty
    @Pattern(regexp = "^(SB-){1}[0-9]{3,5}$")
    private String savingBookCode;

    private String startDay;
    @NotNull
    @Min(1)
//    @Pattern(regexp = "^[0-9]+$")
    private Integer term;

    @Min(value = 30000,message = "deposit amount must higher than 3000")
    @NotNull
    private Integer amount;

    @Valid
    private CustomerDto customer;

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

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        SavingBookDto savingBookDto = (SavingBookDto) target;
        if (savingBookDto.getStartDay().equals("")) {
            errors.rejectValue("startDay", "empty.startday", "not empty day ");
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate now = LocalDate.now();
            LocalDate startDay = LocalDate.parse(savingBookDto.getStartDay(), formatter);

            if (startDay.isBefore(now)) {
                errors.rejectValue("startDay", "wrong.startday", "Please choose correct start day ");

            }
        }

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate now = LocalDate.now();
//        LocalDate startDay = LocalDate.parse(savingBookDto.getStartDay(), formatter);
//
//        if (startDay.isBefore(now)) {
//            errors.rejectValue("startDay", "wrong.startday", "Please choose correct start day ");
//
//        }
//    }
        String term1 = String.valueOf(savingBookDto.getTerm());
        if(!term1.matches("^[0-9]+$")){
            errors.rejectValue("term","wrong.term","input wrong term");
        }


    }


}