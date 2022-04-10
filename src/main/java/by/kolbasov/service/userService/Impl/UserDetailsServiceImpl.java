package by.kolbasov.service.userService.Impl;

import by.kolbasov.entity.user.Role;
import by.kolbasov.entity.user.User;
import by.kolbasov.repository.userRepo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User foundUser = userRepository.findByLogin(username);
        if (foundUser == null) {
            throw new UsernameNotFoundException("Can't find user by provided name!");
        }

        return new org.springframework.security.core.userdetails.User(foundUser.getLogin(),
                foundUser.getPassword(), getUserAuthorities(foundUser));
    }

    private Set<GrantedAuthority> getUserAuthorities(User user) {
        //Set<Role> roles = user.getRoles();
        Role role = user.getRole();
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        return grantedAuthorities;
    }
}