package by.kolbasov.service.regService.impl;

import by.kolbasov.entity.goods.Registrator;
import by.kolbasov.repository.RegistratorRepository;
import by.kolbasov.service.regService.RegistratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistratorServiceImpl implements RegistratorService {
    @Autowired
    private RegistratorRepository registratorRepository;

    @Override
    public List<Registrator> findAll() {
        return registratorRepository.findAll();
    }

    @Override
    public Registrator findById(Long id) {
        return registratorRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Registrator registrator) {
        registratorRepository.save(registrator);
    }
}
