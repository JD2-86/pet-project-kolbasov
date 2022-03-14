package by.kolbasov.dao;

import by.kolbasov.dao.inreface.CamerasDao;
import by.kolbasov.entity.Cameras;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CamerasDaoImpl implements CamerasDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Cameras cameras) {
        sessionFactory.openSession().save(cameras);
        sessionFactory.close();
    }



    @Override
    public List<Cameras> findAll()
    {   Session session=sessionFactory.openSession();
        CriteriaBuilder cb =  sessionFactory.getCriteriaBuilder();
        CriteriaQuery<Cameras> criteria = cb.createQuery(Cameras.class);
        criteria.select(criteria.from(Cameras.class));
        return session.createQuery(criteria).getResultList();
    }

    @Override
    public Cameras findById(Long id) {
        Session session=sessionFactory.openSession();
        return session.get(Cameras.class,id);
    }
}
