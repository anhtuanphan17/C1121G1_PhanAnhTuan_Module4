package blog.create_blog.blog_app.repository;

import blog.create_blog.blog_app.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findAllByTitleContaining(String keyword, Pageable pageable);
}
