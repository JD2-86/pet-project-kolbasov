package by.kolbasov.service.cartService;

import by.kolbasov.entity.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findByUserId(String login);

}
