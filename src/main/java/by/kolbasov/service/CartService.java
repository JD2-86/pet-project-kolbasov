package by.kolbasov.service;

import by.kolbasov.Status;
import by.kolbasov.dto.CartDto;
import by.kolbasov.entity.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findByUserId(String login);

    void deleteCamera(Long id, String login);

    void deleteIntercom(Long id, String login);

    void deleteRegistrator(Long id, String login);

    void saveCamera(Long id, String login);

    void saveRegistrator(Long id, String login);

    void saveIntercom(Long id, String login);

    CartDto findCartByUserId(String login);

    void setOrder(Long id);

    List<CartDto> findByStatus(Status status);

}
