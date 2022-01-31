package entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;


    public User(String username, String password, String firstname, String lastname, String email) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public  User ()
    {

    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }





}
