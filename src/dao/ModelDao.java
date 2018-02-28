package dao;

import model.ModelDetailEntity;
import model.params.ModelParam;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.io.Serializable;

public class ModelDao {



    public ModelDetailEntity addModel(ModelDetailEntity entity) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Serializable result = session.save(entity);
        transaction.commit();
        int modelId = (Integer) result;
        Transaction quary = session.beginTransaction();
        ModelDetailEntity quaryResult = session.get(ModelDetailEntity.class, modelId);
        quary.commit();
        session.close();
        return quaryResult;
    }
}
