package com.email_box.repo.impl;

import com.email_box.model.Email;
import com.email_box.repo.IEmailRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmailRepo implements IEmailRepo {


    private static List<Email> emailList = new ArrayList<>();
    private static List<String> languageList ;

    static {
        emailList.add(new Email(1,"tuan@gmail.com","Vietnamese",5,true,"Tuan Phan"));
        emailList.add(new Email(2,"chien12@gmail.com","Japanese",20,false,"Chien Le"));
        emailList.add(new Email(3,"huy1234@gmail.com","English",15,true,"Huy Tran"));
        languageList = Arrays.asList("Vietnamese","Japanese","English","Chinese");
    }

    private static Integer id = emailList.size()+1;

    public List<Email>findAll(){
        return emailList;
    }

    @Override
    public List<String> getLanguageList() {
        return languageList;
    }

    @Override
    public void addEmail(Email email) {
        email.setEmailId(id);
        emailList.add(email);
    }

}
