package com.picture_of_day.service.impl;

import com.picture_of_day.model.Comment;
import com.picture_of_day.repository.BaseRepository;
import com.picture_of_day.service.ICommentService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class CommentService implements ICommentService {

    @Override
    public void save(Comment comment) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(comment);
        entityTransaction.commit();

    }

    @Override
    public List<Comment> findAllComment() {
        TypedQuery typedQuery = BaseRepository.entityManager.createQuery("select c from comment as c", Comment.class);
        return typedQuery.getResultList();
    }
}
