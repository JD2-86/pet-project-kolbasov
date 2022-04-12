package by.kolbasov.service;

import by.kolbasov.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    void save(Order order, String login);
    Order findById(Long id);
}
