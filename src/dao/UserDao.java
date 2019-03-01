package dao;

import model.ModelDetailEntity;
import model.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.io.Serializable;

public class UserDao {


    public boolean addUser(UserEntity entity) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Serializable result = session.save(entity);
            transaction.commit();
            session.close();
            System.out.println("======"+entity.getUid());
            int uid = (Integer) result;
            if(uid == 0){
                return false;
            }

            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            session.close();
        }

    }
}
