package by.kolbasov.controllers;

import by.kolbasov.dto.OrderDto;
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
        List<OrderDto> orders = orderService.findAll();
        model.addAttribute("order",orders);
        model.addAttribute("url","orders");
        return "orders";
    }

    @GetMapping("/orders/{id}")
    public String orderDetails(@PathVariable(value = "id") long id, Model model){
        OrderDto order = orderService.findById(id);
        model.addAttribute("order",order);
        return "orderDetails";
    }
    @PostMapping("/orders/{id}/remove")
    public String removeGoodsOrder(@PathVariable(value = "id") long id){
        orderService.deleteOrder(id);
        return "redirect:/orders";
    }
}
