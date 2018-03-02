package utils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static Session session;

    private HibernateUtil(){
    }

    static{
//        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
//        sessionFactory=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        Configuration configuration = new Configuration().configure();
        //创建SessionFactory实例
        sessionFactory = configuration.buildSessionFactory();
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