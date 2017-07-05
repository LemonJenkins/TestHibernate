import org.hibernate.Transaction;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class DaoForAll {

    public void addPojoInDB(Object pojo) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(pojo);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
//            session.flush();
            session.close();
        }
    }

    public void deleteUser(Class clazz, int pojoId) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Object pojo = (Object) session.load(clazz, new Integer(pojoId));
            session.delete(pojo);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
 //           session.flush();
            session.close();
        }
    }

    public void updateUser(Object pojo) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(pojo);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
//            session.flush();
            session.close();
        }
    }

    public List<Object> getAllUsers(Class typeOfPojo) {
        String typPojoInString = typeOfPojo.getName();
        List<Object> users = new ArrayList<Object>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            users = session.createQuery("from " + typPojoInString).list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
//            session.flush();
            session.close();
        }
        return users;
    }

}
