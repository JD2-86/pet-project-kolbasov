package by.kolbasov.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

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

    @ManyToMany
    @JoinTable(
            name = "camera_link",
            joinColumns = @JoinColumn(name = "fk_cart"),
            inverseJoinColumns = @JoinColumn(name = "fk_camera"))
    private List<Camera> camera = new LinkedList<Camera>();

    @ManyToMany
    @JoinTable(
            name = "registrator_link",
            joinColumns = @JoinColumn(name = "fk_cart"),
            inverseJoinColumns = @JoinColumn(name = "fk_camera"))
    private List<Registrator> registrator = new LinkedList<Registrator>();

    @ManyToMany
    @JoinTable(
            name = "intercom_link",
            joinColumns = @JoinColumn(name = "fk_cart"),
            inverseJoinColumns = @JoinColumn(name = "fk_intercom"))
    private List<Intercom> intercom = new LinkedList<Intercom>();
}
