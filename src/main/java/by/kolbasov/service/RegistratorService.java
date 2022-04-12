package by.kolbasov.service;

import by.kolbasov.dto.RegistratorDto;
import by.kolbasov.entity.Registrator;

import java.util.List;

public interface RegistratorService {
    List<RegistratorDto> findAll();

    RegistratorDto findById(Long id);

    void save(Registrator registrator);
    void delete(Long id);
}
