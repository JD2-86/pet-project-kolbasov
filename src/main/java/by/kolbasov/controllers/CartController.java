package by.kolbasov.controllers;


import by.kolbasov.Status;
import by.kolbasov.dto.CartDto;
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
        CartDto cart = cartService.findCartByUserId(SecurityContextHolder.getContext()
                .getAuthentication().getName());
        model.addAttribute("cart", cart);
        return "cart";
    }

    @PostMapping("/cart/{id}/removeCamera")
    public String removeCamera(@PathVariable(value = "id") long id, Model model) {
        cartService.deleteCamera(id,SecurityContextHolder.getContext()
                .getAuthentication().getName());
        return "redirect:/cart";
    }
    @PostMapping("/cart/{id}/removeRegistrator")
    public String removeRegistrator(@PathVariable(value = "id") long id) {
        cartService.deleteRegistrator(id,SecurityContextHolder.getContext()
                .getAuthentication().getName());
        return "redirect:/cart";
    }
    @PostMapping("/cart/{id}/removeIntercom")
    public String removeIntercome(@PathVariable(value = "id") long id) {
        cartService.deleteIntercom(id,SecurityContextHolder.getContext()
                .getAuthentication().getName());
        return "redirect:/cart";
    }
    @PostMapping("/cart/order/{id}")
    public String sendGoodsOrder(@PathVariable(value = "id") long id){
        cartService.setOrder(id);
        return "redirect:/";
    }

    @GetMapping("/goodsOrders")
    public String goodOrders(Model model) {
        model.addAttribute("cart",cartService.findByStatus(Status.ORDER));
        return "goodsOrder";
    }
}
