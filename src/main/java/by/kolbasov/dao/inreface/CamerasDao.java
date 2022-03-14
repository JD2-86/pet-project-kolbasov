package by.kolbasov.dao.inreface;

import by.kolbasov.entity.Cameras;

import java.util.List;

public interface CamerasDao {
    void save (Cameras cameras);
    List<Cameras> findAll ();
    Cameras findById(Long id);
}
