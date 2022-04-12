package by.kolbasov.service.impl;

import by.kolbasov.dto.IntercomDto;
import by.kolbasov.entity.Intercom;
import by.kolbasov.mapper.IntercomMapper;
import by.kolbasov.repository.IntercomRepository;
import by.kolbasov.service.IntercomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IntercomServiceImpl implements IntercomService {
    @Autowired
    private IntercomRepository intercomRepository;
    @Autowired
    private IntercomMapper intercomMapper;

    @Override
    public List<IntercomDto> findAll() {
        return intercomMapper.intercomListToIntercomDtoList(intercomRepository.findAll());
    }

    @Override
    public IntercomDto findById(Long id) {
        return intercomMapper.IntercomToIntercomDto(intercomRepository.findById(id).orElseThrow());
    }

    @Override
    public void save(Intercom intercom) {
        Intercom newIntercom = intercom;
        intercomRepository.save(newIntercom);
    }

    @Override
    public void delete(Long id) {
        intercomRepository.deleteById(id);
    }
}
