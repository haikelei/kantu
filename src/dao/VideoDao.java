package dao;

import exception.BaseException;
import exception.ExceptionMap;
import model.VideoListEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.io.Serializable;
import java.util.List;

public class VideoDao {

    /**
     * 添加视频
     * @param atlasDetailEntity
     * @return
     */
    public int addVideo(VideoListEntity atlasDetailEntity) {
        Session session = HibernateUtil.getSession();
        try{
            session.beginTransaction();
            Serializable result = session.save(atlasDetailEntity);
            session.getTransaction().commit();
            session.close();
            int atlasId = (Integer) result;
            if(atlasId == 0){
                throw new BaseException(ExceptionMap.ERROR_CODE_10010);
            }
            //没有提交事务 没有关闭session  等图片插入完  失败则回滚
            return atlasId;
        }catch(Exception e){
            throw new BaseException(ExceptionMap.ERROR_CODE_10010);
        }finally {
            session.close();
        }

    }

    public VideoListEntity infoVideoDetail(int videoId) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery(" from VideoListEntity where videoId = :videoId");
//            Query query = session.createQuery("delete from AtlasDetailEntity where atlasId=?");
            List<VideoListEntity> list = query.setParameter("videoId",videoId).list();//设定条件参数
            transaction.commit();
            session.close();
            if(list.size() == 0){
                throw new BaseException(ExceptionMap.ERROR_CODE_10011);
            }
            return list.get(0);
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10011);
        }finally {
            session.close();
        }
    }

    /**
     * 根据视频id删除视频
     * @param videoId
     */
    public void deleteVideo(int videoId) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
//            Query query = session.createQuery(" from VideoListEntity where videoId = :videoId");
            Query query = session.createQuery("delete from VideoListEntity where videoId=:videoId");
            query.setParameter("videoId",videoId).executeUpdate();//设定条件参数
            transaction.commit();
            session.close();
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10012);
        }finally {
            session.close();
        }
    }

    public void updateVideo(VideoListEntity videoListEntity) {
        Session session = HibernateUtil.getSession();
        try{
            Transaction transaction = session.beginTransaction();
            session.update(videoListEntity);
            transaction.commit();
            session.close();
        }catch(Exception e){
            e.printStackTrace();
            throw new BaseException(ExceptionMap.ERROR_CODE_10013);
        }finally {
            session.close();
        }
    }
}
