package by.kolbasov.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistratorDto {
    Long id;
    private float cost;
    private String name;
    private String url;
    private String power_supply;
    private String power_consumption;
    private String dimensions;
    private String weight;
}
