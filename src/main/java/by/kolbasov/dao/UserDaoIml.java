package by.kolbasov.dao;

import by.kolbasov.dao.inreface.UserDao;
import by.kolbasov.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoIml implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(User user) {
       sessionFactory.openSession().save(user);
       sessionFactory.close();

    }

}
