package web.service;


import web.entity.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void update(int id, User user);

    void delete(int id);
}
