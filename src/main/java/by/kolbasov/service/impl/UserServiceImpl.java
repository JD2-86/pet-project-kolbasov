package by.kolbasov.service.impl;

import by.kolbasov.entity.User;
import by.kolbasov.repo.UserRepository;
import by.kolbasov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
