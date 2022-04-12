package by.kolbasov.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntercomDto {
    Long id;
    private float cost;
    private String name;
    private String url;
    private String resolution;
    private String compression;
    private String viewing_angle;
    private String sd;
    private String power_supply;
}
