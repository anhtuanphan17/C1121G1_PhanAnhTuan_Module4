package com.case_study_module4_furama_by_spring.dto.employee;

import com.case_study_module4_furama_by_spring.model.employee.Division;
import com.case_study_module4_furama_by_spring.model.employee.EducationDegree;
import com.case_study_module4_furama_by_spring.model.employee.Position;
import com.case_study_module4_furama_by_spring.model.user.AppUser;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class EmployeeDto {
    private Integer employeeId;
    @NotBlank
    @Pattern(regexp = "^$|^[a-zA-Z]{3,}$")
    private String employeeName;
    @Pattern(regexp = "^\\d{4}[\\-\\/\\s]?((((0[13578])|(1[02]))[\\-\\/\\s]?(([0-2][0-9])|(3[01])))|(((0[469])|(11))[\\-\\/\\s]?(([0-2][0-9])|(30)))|(02[\\-\\/\\s]?[0-2][0-9]))$", message = "invalid date")
    private String employeeBirthday;
    @Pattern(regexp = "^\\d{9}|\\d{11}$",message = "Id card must be 9 or 11 number")
    private String employeeIdCard;
    private Double employeeSalary;
    @Pattern(regexp = "^(((090)|(091)|(\\+8490)|(\\+8491))\\d{7}$)",message = "correct format phone number is 090xxxxxxx or 091xxxxxxxx")
    private String employeePhone;
    @Email
    private String employeeEmail;
    @NotBlank
    private String employeeAddress;
    private int active = 1;
    private Position position;

    private EducationDegree educationDegree;


    private Division division;

    private AppUser appUser;

    public EmployeeDto() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}
