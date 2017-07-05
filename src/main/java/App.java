import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


        Transaction trn = null;

        Pass pass1 = new Pass();
        pass1.setPass("u3");

//        DaoForAll dao = new DaoForAll();
//        RegUser user1 = new RegUser();
//        user1.setName("User1");
//        user1.setNickName("AAA");
//        user1.setPass(pass1);
//        dao.addPojoInDB(user1);
//        List<Object> ru = dao.getAllUsers(RegUser.class);
//        System.out.println(((RegUser) ru.get(0)).getId());
//        System.out.println(((RegUser) ru.get(0)).getName());
//        System.out.println(((RegUser) ru.get(0)).toStrint());


       // System.out.println(user1.toStrint());
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trn = session.beginTransaction();
            session.save(pass1);
            trn.commit();
        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {

          //  session.flush();
            session.close();

            HibernateUtil.getSessionFactory().close();
        }

    }
}
