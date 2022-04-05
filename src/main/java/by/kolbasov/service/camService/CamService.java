package by.kolbasov.service.camService;

import by.kolbasov.entity.goods.Camera;

import java.util.List;

public interface CamService {
    Camera findById(Long id);
    List<Camera> findAll();
}
