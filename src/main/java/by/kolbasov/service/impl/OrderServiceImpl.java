package by.kolbasov.service.impl;

import by.kolbasov.dto.OrderDto;
import by.kolbasov.entity.Order;
import by.kolbasov.entity.User;
import by.kolbasov.mapper.OrderMapper;
import by.kolbasov.repository.OrderRepository;
import by.kolbasov.repository.UserRepository;
import by.kolbasov.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<OrderDto> findAll() {
        return orderMapper.orderListToOrderDtoList(orderRepository.findAll());
    }

    @Override
    public void save(Order order, String login) {
        User user=userRepository.findByLogin(login);
        order.setUser(user);
        orderRepository.save(order);
    }

    @Override
    public OrderDto findById(Long id) {
        return orderMapper.OrderToOrderDto(orderRepository.findById(id).orElseThrow());
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.delete(orderRepository.findById(id).orElseThrow());
    }
}
