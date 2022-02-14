package dao;

import dao.inreface.CamerasDao;
import entity.Cameras;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;

import java.util.List;
import java.util.Objects;

public class CamerasDaoImpl implements CamerasDao {

    private static CamerasDaoImpl camerasDao;

    public static CamerasDaoImpl getInstance() {
        if (Objects.isNull(camerasDao)) {
            camerasDao = new CamerasDaoImpl();
        }
        return camerasDao;
    }
    @Override
    public void save(Cameras cameras) {
        Session session = SessionUtil.openSession();
        session.getTransaction().begin();
        session.save(cameras);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Cameras> findAll()
    {   Session session = SessionUtil.openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Cameras> criteria = cb.createQuery(Cameras.class);
        criteria.select(criteria.from(Cameras.class));
        return session.createQuery(criteria).getResultList();
    }
}
