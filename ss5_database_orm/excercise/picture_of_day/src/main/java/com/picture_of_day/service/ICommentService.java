package com.picture_of_day.service;

import com.picture_of_day.model.Comment;

import java.util.List;

public interface ICommentService {
    void save(Comment comment);

    List<Comment> findAllComment();
}
