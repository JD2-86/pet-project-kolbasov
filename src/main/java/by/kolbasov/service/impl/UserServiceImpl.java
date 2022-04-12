package by.kolbasov.service.impl;

import by.kolbasov.CustomException;
import by.kolbasov.dto.UserDto;
import by.kolbasov.entity.Role;
import by.kolbasov.entity.User;
import by.kolbasov.mapper.UserMapper;
import by.kolbasov.repository.RoleRepository;
import by.kolbasov.repository.UserRepository;
import by.kolbasov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        if(userRepository.existsByLogin(user.getLogin())){
            throw new CustomException("Пользователь с таким логином уже сущствует");

        }
        Role userRole = roleRepository.findByName("USER");
        user.setRole(userRole);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public UserDto findByLogin(String login) {
        return userMapper.UserToUserDto(userRepository.findByLogin(login));
    }


}
