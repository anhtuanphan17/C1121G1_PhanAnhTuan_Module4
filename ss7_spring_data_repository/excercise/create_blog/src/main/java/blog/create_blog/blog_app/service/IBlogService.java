package blog.create_blog.blog_app.service;

import blog.create_blog.blog_app.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
;

    void save(Blog blogs);

    Blog findById(int id);

    void delete(Blog blogs);

    Page<Blog> findAllPaging(String keywordValue, Pageable pageable);
}
