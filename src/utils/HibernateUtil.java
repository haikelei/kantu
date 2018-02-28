package utils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static Session session;

    private HibernateUtil(){
    }

    static{
        Configuration cfg = new Configuration();
        cfg.configure();
        sessionFactory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static Session getSession(){
        session = sessionFactory.openSession();
        return session;
    }

    //关闭session
    public static void closeSession(){
        if(session!=null){
            session.close();
            session = null;
        }
    }
}