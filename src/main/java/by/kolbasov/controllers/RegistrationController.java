package by.kolbasov.controllers;


import by.kolbasov.entity.Camera;
import by.kolbasov.entity.User;
import by.kolbasov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/registration")
    public String registration(Model model) {
        model.addAttribute("user", new User());

        return "registration";
    }

    @PostMapping(path = "/registration")
    public String addUser(@ModelAttribute("user") User user) {
//        User newUser = new User(login, password, firstname, lastname, email);
        userService.save(user);
        return "redirect:/login";
    }
}
