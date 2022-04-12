package by.kolbasov.service;

import by.kolbasov.dto.UserDto;
import by.kolbasov.entity.User;

public interface UserService {
    void save(User user);

    UserDto findByLogin(String login);


}
