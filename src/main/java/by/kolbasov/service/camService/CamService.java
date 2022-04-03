package by.kolbasov.service.camService;

import by.kolbasov.entity.Cameras;

import java.util.List;

public interface CamService {
    Cameras findById(Long id);
    List<Cameras> findAll();
}
