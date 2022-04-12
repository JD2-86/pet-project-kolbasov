package by.kolbasov.dto;

import by.kolbasov.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    Long id;
    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private Role role;
}
