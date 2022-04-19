package blog.create_blog.blog_app.service;

import blog.create_blog.blog_app.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void save(Category category);

    Category findById(Integer id);


    void delete(Integer categoryId);
}
