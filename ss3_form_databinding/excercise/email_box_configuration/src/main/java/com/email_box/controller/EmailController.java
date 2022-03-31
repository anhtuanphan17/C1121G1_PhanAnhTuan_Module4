package com.email_box.controller;

import com.email_box.model.Email;
import com.email_box.repo.IEmailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {

    @Autowired
    private IEmailRepo iEmailRepo;

    @GetMapping("email")
    public String showList(Model model) {
        List<Email> emailList = iEmailRepo.findAll();
        model.addAttribute("emailList", emailList);

        return "list";
    }

    @GetMapping("create")
    public String showCreateForm(ModelMap modelMap) {
        modelMap.addAttribute("email", new Email());
        modelMap.addAttribute("languageList", iEmailRepo.getLanguageList());
        return "create";
    }

    @PostMapping("createEmail")
    public String createEmail(@ModelAttribute Email email) {
//        email.setEmailId();
        iEmailRepo.addEmail(email);
        return "redirect:/email";
    }


}
