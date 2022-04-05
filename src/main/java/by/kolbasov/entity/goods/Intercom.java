package by.kolbasov.entity.goods;

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
    private String SD;// поддержка карты памяти
    private String Power_supply;// питание

    public Intercom(float cost, String name, String url, String resolution, String compression,
                    String viewing_angle, String SD, String power_supply) {
        super(cost, name, url);
        this.resolution = resolution;
        this.compression = compression;
        this.viewing_angle = viewing_angle;
        this.SD = SD;
        Power_supply = power_supply;
    }
}
