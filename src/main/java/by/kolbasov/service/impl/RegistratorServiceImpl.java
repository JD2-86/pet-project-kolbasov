package by.kolbasov.service.impl;

import by.kolbasov.dto.RegistratorDto;
import by.kolbasov.entity.Registrator;
import by.kolbasov.mapper.RegistratorMapper;
import by.kolbasov.repository.RegistratorRepository;
import by.kolbasov.service.RegistratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RegistratorServiceImpl implements RegistratorService {
    @Autowired
    private RegistratorMapper registratorMapper;
    @Autowired
    private RegistratorRepository registratorRepository;


    public List<RegistratorDto> findAll() {

        return registratorMapper.registratorListToRegistratorDtoList(registratorRepository.findAll());
    }

    @Override
    public RegistratorDto findById(Long id) {
        return registratorMapper.registratorToRegistratorDto(registratorRepository.findById(id).orElseThrow());
    }

    @Override
    public void save(Registrator registrator) {
        Registrator newRegistrator=registrator;
        registratorRepository.save(newRegistrator);
    }

    @Override
    public void delete(Long id) {
        registratorRepository.deleteById(id);
    }
}
