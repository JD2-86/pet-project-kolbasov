package by.kolbasov.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
@Table(name = "registrators")
public class Registrator extends BaseGoods {

    private String power_supply; //Источник питания
    private String power_consumption;//Потребляемая мощность
    private String dimensions;//размеры
    private String weight;//вес

    public Registrator(float cost, String name, String url, String power_supply, String power_consumption,
                       String dimensions, String weight) {
        super(cost, name, url);
        this.power_supply = power_supply;
        this.power_consumption = power_consumption;
        this.dimensions = dimensions;
        this.weight = weight;
    }
    public Registrator(){
        super();
    }
}
