package by.kolbasov.controllers;


import by.kolbasov.dao.UserDaoIml;
import by.kolbasov.entity.User;
import by.kolbasov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/registration")
    public String registration(Model model) {
        return "registration";
    }

    @PostMapping(path = "/registration")
    public String AddUSer(@RequestParam String username, @RequestParam String password, @RequestParam String firstname, @RequestParam String lastname, @RequestParam String email) {
        User newUser = new User(username, password, firstname, lastname, email);
        userService.save(newUser);
        return "redirect:/";
    }
}
