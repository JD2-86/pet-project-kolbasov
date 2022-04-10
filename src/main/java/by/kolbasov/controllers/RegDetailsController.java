package by.kolbasov.controllers;

import by.kolbasov.entity.Cart;
import by.kolbasov.entity.goods.Camera;
import by.kolbasov.entity.goods.Registrator;
import by.kolbasov.repository.CartRepository;
import by.kolbasov.service.camService.CamService;
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
public class RegDetailsController {
    @Autowired
    private RegistratorService registratorService;
    @Autowired
    private UserService userService;
    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/registrators/{id}")
    public String CameraDetails(@PathVariable(value = "id") long id, Model model) {
        Registrator registrator = registratorService.findById(id);
        model.addAttribute("registrator", registrator);
        return "registratorDetails";
    }

    @PostMapping(path = "/registrators/{id}")
    public String buy(@PathVariable(value = "id") long id) {
        Authentication authentication = SecurityContextHolder.getContext()
                .getAuthentication();
        Cart cart = new Cart();
        cart.setRegistrator(registratorService.findById(id));
        cart.setUser(userService.findByLogin(authentication.getName()));
        cartRepository.save(cart);
        return "redirect:/registrators";
    }
}
