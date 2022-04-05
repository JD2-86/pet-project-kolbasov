package by.kolbasov.controllers;


import by.kolbasov.entity.Cart;
import by.kolbasov.service.cartService.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public String cart (Model model){
        List<Cart> cart = cartService.findByUserId(SecurityContextHolder.getContext()
                .getAuthentication().getName());
        model.addAttribute("cart",cart);
        return "cart";
    }
}
