package by.kolbasov.controllers;

import by.kolbasov.entity.Cart;
import by.kolbasov.entity.goods.Intercom;
import by.kolbasov.entity.goods.Registrator;
import by.kolbasov.repository.CartRepository;
import by.kolbasov.service.intercomService.IntercomService;
import by.kolbasov.service.regService.RegistratorService;
import by.kolbasov.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IntercomDetailsController {
    @Autowired
    private IntercomService intercomService;
    @Autowired
    private UserService userService;
    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/intercoms/{id}")
    public String CameraDetails(@PathVariable(value = "id") long id, Model model) {
        Intercom intercom = intercomService.findById(id);
        model.addAttribute("intercom", intercom);
        return "intercomDetails";
    }

    @PostMapping(path = "/intercoms/{id}")
    public String buy(@PathVariable(value = "id") long id) {
        Authentication authentication = SecurityContextHolder.getContext()
                .getAuthentication();
        Cart cart = new Cart();
        cart.setIntercom(intercomService.findById(id));
        cart.setUser(userService.findByLogin(authentication.getName()));
        cartRepository.save(cart);
        return "redirect:/intercoms";
    }

}
