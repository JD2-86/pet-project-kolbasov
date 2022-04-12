package by.kolbasov.repository;

import by.kolbasov.entity.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamRepository extends JpaRepository<Camera,Long> {
}
