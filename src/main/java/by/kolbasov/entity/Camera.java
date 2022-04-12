package by.kolbasov.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "cameras")
public class Camera extends BaseGoods {
    private String matrix;
    private String sensitivity;
    private String viewing_angle;
    private String resolution;

    public Camera(float cost, String name, String url, String matrix, String sensitivity, String viewing_angle, String resolution) {
        super(cost, name, url);
        this.matrix = matrix;
        this.sensitivity = sensitivity;//чувствительность
        this.viewing_angle = viewing_angle;//Угол обзора
        this.resolution = resolution; //разрешение
    }
    public Camera(){
        super();
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (!(obj instanceof Camera))
            return false;
        Camera other = (Camera) obj;
        return id != null && id.equals(other.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode() ;
    }

}
