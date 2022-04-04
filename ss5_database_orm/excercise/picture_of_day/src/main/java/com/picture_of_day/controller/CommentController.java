package com.picture_of_day.controller;

import com.picture_of_day.model.Comment;
import com.picture_of_day.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Controller
public class CommentController {
    @Autowired
    private ICommentService iCommentService;

    @GetMapping("/home")
    public String goHomePage(ModelMap modelMap) {
        modelMap.addAttribute("comment", new Comment());
        List<Comment> commentList = iCommentService.findAllComment();
        modelMap.addAttribute("commentList", commentList);
        return "home";
    }


    @PostMapping("/comment")
    public String receiveComment(@ModelAttribute Comment comment) {
        comment.setDate(String.valueOf(LocalDate.now()));
        comment.setLike(0);
        iCommentService.save(comment);

        return "redirect:/home";
    }


}
