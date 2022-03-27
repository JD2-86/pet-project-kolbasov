package by.kolbasov.service;

import by.kolbasov.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {
  void save(User user);
}
