package by.kolbasov.repository;



import by.kolbasov.model.Status;
import by.kolbasov.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findAllByUser_Login(String login);
    Cart findByUser_Login(String login);
    List<Cart> findAllByStatus(Status status);
}
