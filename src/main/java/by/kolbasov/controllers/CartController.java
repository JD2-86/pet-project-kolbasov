package by.kolbasov.controllers;


import by.kolbasov.entity.Cart;
import by.kolbasov.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public String cart(Model model) {
        Cart cart = cartService.findCartByUserId(SecurityContextHolder.getContext()
                .getAuthentication().getName());
        model.addAttribute("cart", cart);
        return "cart";
    }

    @PostMapping("/cart/{id}/remove")
    public String remove(@PathVariable(value = "id") long id, Model model) {
        cartService.delete(id,SecurityContextHolder.getContext()
                .getAuthentication().getName());
        return "redirect:/cart";
    }

}
