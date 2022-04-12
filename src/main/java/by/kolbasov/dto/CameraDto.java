package by.kolbasov.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CameraDto {
    Long id;
    private float cost;
    private String name;
    private String url;
    private String matrix;
    private String sensitivity;
    private String viewing_angle;
    private String resolution;
}
