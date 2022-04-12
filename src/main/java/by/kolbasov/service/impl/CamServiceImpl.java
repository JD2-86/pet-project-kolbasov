package by.kolbasov.service.impl;

import by.kolbasov.dto.CameraDto;
import by.kolbasov.entity.Camera;
import by.kolbasov.mapper.CameraMapper;
import by.kolbasov.repository.CamRepository;
import by.kolbasov.service.CamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CamServiceImpl implements CamService {

    @Autowired
    private  CameraMapper cameraMapper;
    @Autowired
    private CamRepository camRepository;



    @Override
    public CameraDto findById(Long id)  {
        return cameraMapper.cameraToCameraDto(camRepository.findById(id).orElseThrow());
    }

    @Override
    public List<CameraDto> findAll() {
        return cameraMapper.cameraListToCameraDtoList(camRepository.findAll());
    }

    @Override
    public void save(Camera camera) {
        Camera newCamera =camera;
        camRepository.save(newCamera);
    }

    @Override
    public void delete(long id) {
        camRepository.deleteById(id);
    }

}
