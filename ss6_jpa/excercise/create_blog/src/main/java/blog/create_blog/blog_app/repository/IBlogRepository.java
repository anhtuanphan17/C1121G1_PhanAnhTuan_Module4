package blog.create_blog.blog_app.repository;

import blog.create_blog.blog_app.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBlogRepository extends JpaRepository<Blog,Integer> {
}
