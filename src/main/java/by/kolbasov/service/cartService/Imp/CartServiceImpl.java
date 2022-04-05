package by.kolbasov.service.cartService.Imp;

import by.kolbasov.entity.Cart;
import by.kolbasov.repository.CartRepository;
import by.kolbasov.service.cartService.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Override
    public List<Cart> findByUserId(String login) {
        return cartRepository.findAllByUser_Login(login);
    }
}
