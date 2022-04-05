package by.kolbasov.entity.goods;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "registrators")
public class Registrator extends BaseGoods {

    private String Power_supply; //Источник питания
    private String Power_consumption;//Потребляемая мощность
    private String Dimensions;//размеры
    private String weight;//вес

    public Registrator(float cost, String name, String url, String power_supply, String power_consumption,
                       String dimensions, String weight) {
        super(cost, name, url);
        Power_supply = power_supply;
        Power_consumption = power_consumption;
        Dimensions = dimensions;
        this.weight = weight;
    }
    public Registrator(){
        super();
    }
}
