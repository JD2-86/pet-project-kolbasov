package by.kolbasov.service;

import by.kolbasov.dto.OrderDto;
import by.kolbasov.entity.Order;

import java.util.List;

public interface OrderService {
    List<OrderDto> findAll();
    void save(Order order, String login);
    OrderDto findById(Long id);
    void deleteOrder(Long id);
}
