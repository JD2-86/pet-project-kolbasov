package by.kolbasov.repo;

import by.kolbasov.entity.Cameras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamRepository extends JpaRepository<Cameras,Long> {
}
