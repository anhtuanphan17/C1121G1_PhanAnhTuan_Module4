package repo;

import com.user.model.Login;
import com.user.model.User;

public interface IUserRepo {
    User checkLogin(Login login);
}
