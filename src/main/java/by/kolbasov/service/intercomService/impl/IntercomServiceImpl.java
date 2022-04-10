package by.kolbasov.service.intercomService.impl;

import by.kolbasov.entity.goods.Intercom;
import by.kolbasov.repository.IntercomRepository;
import by.kolbasov.service.intercomService.IntercomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntercomServiceImpl implements IntercomService {
    @Autowired
    private IntercomRepository intercomRepository;

    @Override
    public List<Intercom> findAll() {
        return intercomRepository.findAll();
    }

    @Override
    public Intercom findById(Long id) {
        return intercomRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Intercom intercom) {
        intercomRepository.save(intercom);
    }
}
