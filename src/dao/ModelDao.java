package dao;

import exception.BaseException;
import exception.ExceptionMap;
import model.ModelDetailEntity;
import model.params.ModelParam;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import utils.HibernateUtil;

import java.io.Serializable;

public class ModelDao {



    public ModelDetailEntity addModel(ModelDetailEntity entity) {
        try{
            Session session = HibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            Serializable result = session.save(entity);
            transaction.commit();
            System.out.println("======"+entity.getModelId());
            int modelId = (Integer) result;
            Transaction quary = session.beginTransaction();
            ModelDetailEntity quaryResult = session.get(ModelDetailEntity.class, modelId);
            quary.commit();
            session.close();
            return quaryResult;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public boolean deleteModel (ModelDetailEntity entity) {
        try{
            Session session = HibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public ModelDetailEntity quaryModel (ModelDetailEntity entity) {
        try{
            Session session = HibernateUtil.getSession();
            Transaction quaryTransaction = session.beginTransaction();
            ModelDetailEntity result = session.get(ModelDetailEntity.class, entity.getModelId());
            quaryTransaction.commit();
            session.close();
            if(result == null){
                throw new BaseException(ExceptionMap.ERROR_CODE_10002);
            }
            return result;
        }catch (Exception e){
            if(e instanceof BaseException){
                throw (BaseException)e;
            }
            throw  new BaseException(ExceptionMap.ERROR_CODE_10004);
        }

    }

    public boolean updateModel(ModelDetailEntity entity) {
        try{
            //先查询 查不到报错 查到了就更新
            quaryModel(entity);
            Session session = HibernateUtil.getSession();
            Transaction quaryTransaction = session.beginTransaction();
            session.update(entity);
            quaryTransaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            if(e instanceof BaseException){
                throw (BaseException)e;
            }
            throw new BaseException(ExceptionMap.ERROR_CODE_10003);
        }
    }
}
