package by.kolbasov.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name ="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String num;
    private String period;
    private String description;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Order(){
    }

}
