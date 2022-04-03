package by.kolbasov.entity.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private String email;

    public User(String username, String password, String firstname, String lastname, String email) {
        this.login = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public User() {
    }

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;



}
