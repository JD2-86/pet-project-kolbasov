package by.kolbasov.entity;

import by.kolbasov.entity.goods.Camera;
import by.kolbasov.entity.goods.Intercom;
import by.kolbasov.entity.goods.Registrator;
import by.kolbasov.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="cameras_id")
    private Camera camera;

    @ManyToOne
    @JoinColumn(name="registrator_id")
    private Registrator registrator;

    @ManyToOne
    @JoinColumn(name="intercom_id")
    private Intercom intercom;
}
