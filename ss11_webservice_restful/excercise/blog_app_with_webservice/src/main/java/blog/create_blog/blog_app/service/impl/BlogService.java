package blog.create_blog.blog_app.service.impl;

import blog.create_blog.blog_app.model.Blog;
import blog.create_blog.blog_app.repository.IBlogRepository;
import blog.create_blog.blog_app.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService{

    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blogs) {
        iBlogRepository.save(blogs);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Blog blogs) {
        iBlogRepository.delete(blogs);
    }

    @Override
    public Page<Blog> findAllPaging(String keywordValue, Pageable pageable) {
        return this.iBlogRepository.findAllByTitleContaining(keywordValue,pageable);
    }

    @Override
    public List<Blog> findAllByCategory_CategoryNameContaining(String name) {
        return iBlogRepository.findAllByCategory_CategoryNameContaining(name);
    }

    @Override
    public List<Blog> findAllBlogByCategoryName(String name) {
        return iBlogRepository.findAllBlogByCategoryName(name);
    }


}
