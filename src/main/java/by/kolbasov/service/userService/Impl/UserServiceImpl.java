package by.kolbasov.service.userService.Impl;

import by.kolbasov.entity.user.Role;
import by.kolbasov.entity.user.User;
import by.kolbasov.repository.userRepo.RoleRepository;
import by.kolbasov.repository.userRepo.UserRepository;
import by.kolbasov.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void save(User user) {
        Role userRole = roleRepository.findByName("USER");
        user.setRole(userRole);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }


}
