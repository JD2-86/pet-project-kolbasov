package by.kolbasov.controllers;

import by.kolbasov.entity.Order;
import by.kolbasov.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/sendOrder")
    public String makeOrder(Model model) {
        model.addAttribute("order", new Order());
        return "sendOrder";
    }

    @PostMapping("/sendOrder")
    public String sendOrder(@ModelAttribute("order") Order order) {
        orderService.save(order, SecurityContextHolder.getContext()
                .getAuthentication().getName());
        return "redirect:/";
    }

    @GetMapping("/orders")
    public String orders (Model model){
        List<Order> orders = orderService.findAll();
        model.addAttribute("order",orders);
        return "orders";
    }

    @GetMapping("/orders/{id}")
    public String orderDetails(@PathVariable(value = "id") long id, Model model){
        Order order = orderService.findById(id);
        model.addAttribute("order",order);
        model.addAttribute("url","orders");
        return "orderDetails";
    }

}
