package com.email_box.repo;

import com.email_box.model.Email;

import java.util.List;

public interface IEmailRepo {
    public List<Email> findAll();

    List<String> getLanguageList();

    void addEmail(Email email);
}
