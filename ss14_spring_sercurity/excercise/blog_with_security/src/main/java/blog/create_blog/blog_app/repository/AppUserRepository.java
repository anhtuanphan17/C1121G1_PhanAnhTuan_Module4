package blog.create_blog.blog_app.repository;

import blog.create_blog.blog_app.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {

    AppUser findByUserName(String userName);
}
