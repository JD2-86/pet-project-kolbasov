package by.kolbasov.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    private float cost;
    private String name;
    private String url;

    public BaseGoods(float cost, String name, String url) {
        this.cost = cost;
        this.name = name;
        this.url = url;
    }

    public BaseGoods() {
    }
}
