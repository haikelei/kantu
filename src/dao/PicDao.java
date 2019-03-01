package dao;

import exception.BaseException;
import exception.ExceptionMap;
import model.AtlasDetailEntity;
import model.PicDetailEntity;
import model.params.InfoAtlasParam;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class PicDao {
    //根据atlasid删除所有图集下的图片
    public void deletePic(AtlasDetailEntity entity) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
//            Query query = dao.getSession().createQuery("delete from TUser where IId=?");
            Query query = session.createQuery("delete from PicDetailEntity where atlasId=:atlasId");
            query.setParameter("atlasId",entity.getAtlasId());//设定条件参数
            query.executeUpdate();
            transaction.commit();
            session.close();
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10007);
        }finally {
            session.close();
        }
    }

    public List<PicDetailEntity>  infoPicList(InfoAtlasParam param) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery(" from PicDetailEntity where atlasId = ? ");
            List<PicDetailEntity> list = query.setParameter(0,param.getAtlasId()).list();//设定条件参数
            transaction.commit();
            session.close();
            if(list.size() == 0){
                throw new BaseException(ExceptionMap.ERROR_CODE_10008);
            }
            return list;
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10008);
        }finally {
            session.close();
        }
    }


}
