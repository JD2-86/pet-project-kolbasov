package by.kolbasov.mapper;

import by.kolbasov.dto.CameraDto;
import by.kolbasov.entity.Camera;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CameraMapper {
    CameraDto cameraToCameraDto(Camera camera);
    List<CameraDto> cameraListToCameraDtoList(List<Camera> cameras);

}
