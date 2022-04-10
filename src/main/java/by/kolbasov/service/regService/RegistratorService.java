package by.kolbasov.service.regService;

import by.kolbasov.entity.goods.Registrator;
import by.kolbasov.repository.RegistratorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface RegistratorService {
    List<Registrator> findAll();

    Registrator findById(Long id);

    void save(Registrator registrator);
}
