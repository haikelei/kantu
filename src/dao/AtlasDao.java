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

import java.io.Serializable;
import java.util.List;

public class AtlasDao {




    /**
     * 返回图集id
     * @param atlasDetailEntity
     * @return
     */
    public int addAtlasDetail(AtlasDetailEntity atlasDetailEntity) {
        Session createAtlasSession = HibernateUtil.getSession();
        try{
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
        }catch(Exception e){
            throw new BaseException(ExceptionMap.ERROR_CODE_10005);
        }finally {
            createAtlasSession.close();
        }

    }

    public boolean addPicDetail(PicDetailEntity picDetailEntity) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Serializable result = session.save(picDetailEntity);
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10006);
        }finally {
            session.close();
        }

    }

    /**
     * 删除atlasdetail
     * @param entity
     * @return
     */
    public boolean deleteAtlasDetail(AtlasDetailEntity entity) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("delete from AtlasDetailEntity where atlasId=?");
            query.setParameter(0,entity.getAtlasId());//设定条件参数
            query.executeUpdate();
            transaction.commit();
            session.close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10007);
        }finally {
            session.close();
        }
    }

    public AtlasDetailEntity infoAtlasDetail(InfoAtlasParam param) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery(" from AtlasDetailEntity where atlasId = :atlasId");
//            Query query = session.createQuery("delete from AtlasDetailEntity where atlasId=?");
            List<AtlasDetailEntity> list = query.setParameter("atlasId",param.getAtlasId()).list();//设定条件参数
            transaction.commit();
            session.close();
            if(list.size() == 0){
                throw new BaseException(ExceptionMap.ERROR_CODE_10008);
            }
            return list.get(0);
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10008);
        }finally {
            session.close();
        }
    }

    //更新图集信息
    public void updateAtlasDetai(AtlasDetailEntity atlasDetailEntity) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            session.update(atlasDetailEntity);
            transaction.commit();
            session.close();
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10009);
        }finally {
            session.close();
        }
    }

    public List<AtlasDetailEntity> infoAllByTime() {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery(" from AtlasDetailEntity order by atlasTime desc");
            List<AtlasDetailEntity> list = query.list();//设定条件参数
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

    public List<AtlasDetailEntity> infoAllByHot() {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery(" from AtlasDetailEntity order by atlasDownload desc");
            List<AtlasDetailEntity> list = query.list();//设定条件参数
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

    public List<AtlasDetailEntity> infoPrivate() {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery(" from AtlasDetailEntity where type = 1");
            List<AtlasDetailEntity> list = query.list();//设定条件参数
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

    public List<AtlasDetailEntity> infoAllByModel(int paramId) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery(" from AtlasDetailEntity where modelId=?");
            List<AtlasDetailEntity> list = query.setParameter(0,paramId).list();//设定条件参数
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
