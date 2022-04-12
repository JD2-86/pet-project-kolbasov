package by.kolbasov.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Intercom extends BaseGoods {

    private String resolution;//разрешение
    private String compression;//формат сжатия видео
    private String viewing_angle;//угол обзора
    private String sd;// поддержка карты памяти
    private String power_supply;// питание

    public Intercom(float cost, String name, String url, String resolution, String compression,
                    String viewing_angle, String sd, String power_supply) {
        super(cost, name, url);
        this.resolution = resolution;
        this.compression = compression;
        this.viewing_angle = viewing_angle;
        this.sd = sd;
        this.power_supply = power_supply;
    }
    public Intercom(){
        super();
    }
}
