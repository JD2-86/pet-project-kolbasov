package by.kolbasov.service;

import by.kolbasov.entity.User;

public interface UserService {
    void save(User user);

    User findByLogin(String login);


}
