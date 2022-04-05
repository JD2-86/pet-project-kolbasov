package by.kolbasov.controllers;

import by.kolbasov.entity.goods.Camera;
import by.kolbasov.entity.Cart;
import by.kolbasov.repository.CartRepository;
import by.kolbasov.service.camService.CamService;
import by.kolbasov.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class CamDetailsController {

    @Autowired
    private CamService camService;
    @Autowired
    private UserService userService;
    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/cameras/{id}")
    public String CameraDetails(@PathVariable(value = "id") long id, Model model) {
        Camera cam = camService.findById(id);
        model.addAttribute("cam", cam);
        return "camera_details";
    }

    @PostMapping(path = "/cameras/{id}")
    public String buy(@PathVariable(value = "id") long id) {
        Authentication authentication = SecurityContextHolder.getContext()
                .getAuthentication();
        Cart cart = new Cart();
        cart.setCamera(camService.findById(id));
        cart.setUser(userService.findByLogin(authentication.getName()));
        cartRepository.save(cart);
        return "redirect:/camera_details";
    }
}

