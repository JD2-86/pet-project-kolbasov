package by.kolbasov.service.camService.impl;

import by.kolbasov.entity.goods.Camera;
import by.kolbasov.repository.CamRepository;
import by.kolbasov.service.camService.CamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CamServiceImpl implements CamService {

    @Autowired
    private CamRepository camRepository;

    @Override
    public Camera findById(Long id) {
        return camRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Camera> findAll() {
        return camRepository.findAll();
    }

}
