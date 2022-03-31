package com.email_box.model;

public class Email {
    private Integer emailId;
    private String emailAddress;
    private String language;
    private Integer pageSize;
    private Boolean spamsFilter;
    private String signature;

    public Email(Integer emailId, String emailAddress, String language, Integer pageSize, Boolean spamsFilter, String signature) {
        this.emailId = emailId;
        this.emailAddress = emailAddress;
        this.language = language;
        this.pageSize = pageSize;
        this.spamsFilter = spamsFilter;
        this.signature = signature;
    }

    public Email() {

    }

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(Boolean spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
