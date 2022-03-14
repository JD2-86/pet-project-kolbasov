package by.kolbasov.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cameras")
public class Cameras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long cam_id;
    private float cost;
    private String cam_name,url,matrix,sensitivity,viewing_angle,resolution;

    public Cameras(Long cam_id, float cost, String cam_name, String url, String matrix, String sensitivity, String viewing_angle, String resolution) {
        this.cam_id = cam_id;
        this.cost = cost;
        this.cam_name = cam_name;
        this.url = url;
        this.matrix = matrix;
        this.sensitivity = sensitivity;
        this.viewing_angle = viewing_angle;
        this.resolution = resolution;
    }

    public Cameras() {

    }
}
