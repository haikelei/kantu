package dao;

import exception.BaseException;
import exception.ExceptionMap;
import model.AtlasDetailEntity;
import model.PicDetailEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.io.Serializable;

public class AtlasDao {




    /**
     * 返回图集id
     * @param atlasDetailEntity
     * @return
     */
    public int addAtlasDetail(AtlasDetailEntity atlasDetailEntity) {
        Session createAtlasSession = HibernateUtil.getSession();
        Transaction transaction = createAtlasSession.beginTransaction();
        Serializable result = createAtlasSession.save(atlasDetailEntity);
        createAtlasSession.getTransaction().commit();
        createAtlasSession.close();
        int atlasId = (Integer) result;
        if(atlasId == 0){
            transaction.rollback();
            createAtlasSession.close();
            throw new BaseException(ExceptionMap.ERROR_CODE_10005);
        }
        //没有提交事务 没有关闭session  等图片插入完  失败则回滚
        return atlasId;
    }

    public boolean addPicDetail(PicDetailEntity picDetailEntity) {
        try{
            Session session = HibernateUtil.getSession();
            Transaction transaction = session.beginTransaction();
            Serializable result = session.save(picDetailEntity);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10006);
        }

    }
}
