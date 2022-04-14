package blog.create_blog.blog_app.repository;

import blog.create_blog.blog_app.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByTitleContaining(String keyword, Pageable pageable);

//    List<Blog> findAllByCategory_CategoryId(int id);

    List<Blog> findAllByCategory_CategoryNameContaining(String name);

    @Query(value = "select * from blog join category on blog.category_id=category.category_id where category.category_name like concat('%',:name,'%')", nativeQuery = true)
    List<Blog> findAllBlogByCategoryName(String name);

    @Query(value = "select b from blog b where b.category.categoryName like concat('%',:categoryName,'%')")
    List<Blog>findAllByCategoryName(@Param("categoryName") String categoryName);
}
