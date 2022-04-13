package by.kolbasov.controllers;

import by.kolbasov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    private String home(Model model) {
        model.addAttribute("user", userService.findByLogin((SecurityContextHolder.getContext()
                .getAuthentication().getName())));
        return "/index1";
    }

}
