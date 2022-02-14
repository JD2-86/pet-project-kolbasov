package dao.inreface;

import entity.Cameras;
import org.hibernate.Session;

import java.util.List;

public interface CamerasDao {
    void save (Cameras cameras);
    List<Cameras> findAll ();
}
