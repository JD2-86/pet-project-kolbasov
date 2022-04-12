package by.kolbasov.service;

import by.kolbasov.entity.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findByUserId(String login);
    void delete(Long id,String login);
    void saveCamera(Long id,String login);
    void saveRegistrator(Long id,String login);
    void saveIntercom(Long id, String login);
    Cart findCartByUserId(String login);

}
