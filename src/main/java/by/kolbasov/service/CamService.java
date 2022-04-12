package by.kolbasov.service;


import by.kolbasov.dto.CameraDto;
import by.kolbasov.entity.Camera;

import java.util.List;

public interface CamService {
    CameraDto findById(Long id);
    List<CameraDto> findAll();
    void save(Camera camera);
    void delete(long id);
}
