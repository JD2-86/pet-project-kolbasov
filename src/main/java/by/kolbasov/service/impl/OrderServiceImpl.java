package by.kolbasov.service.impl;

import by.kolbasov.entity.Order;
import by.kolbasov.entity.User;
import by.kolbasov.repository.OrderRepository;
import by.kolbasov.repository.UserRepository;
import by.kolbasov.service.OrderService;
import by.kolbasov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void save(Order order, String login) {
        User user=userRepository.findByLogin(login);
        order.setUser(user);
        orderRepository.save(order);
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow();
    }
}
