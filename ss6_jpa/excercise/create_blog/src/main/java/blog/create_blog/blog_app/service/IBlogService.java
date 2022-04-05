package blog.create_blog.blog_app.service;

import blog.create_blog.blog_app.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
;

    void save(Blog blogs);

    Blog findById(int id);

    void delete(Blog blogs);
}
