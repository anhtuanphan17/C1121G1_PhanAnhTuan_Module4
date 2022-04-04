package com.picture_of_day.model;

import javax.persistence.*;

@Entity(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name="comment_rating")
    private Integer rating;
    @Column(name="comment_author")
    private String author;
    @Column(name = "comment_feedback")
    private String feedBack;
    @Column(name="comment_date", columnDefinition = "DATE")
    private String date;
    @Column(name="comment_like")
    private Integer like;

    public Comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }
}
