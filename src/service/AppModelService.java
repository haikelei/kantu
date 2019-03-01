package service;

import dao.AtlasDao;
import dao.ModelDao;
import dao.PicDao;
import model.AtlasDetailEntity;
import model.ModelDetailEntity;
import model.PicDetailEntity;
import model.params.InfoAtlasParam;
import model.params.ModelDetailParam;

import java.util.List;

public class AppModelService {
    private static AppModelService instance;
    private AppModelService() {}
    public static synchronized AppModelService getInstance() {
        if (instance == null) {
            instance = new AppModelService();
        }
        return instance;
    }


    public List<ModelDetailEntity> getModelList() {
        ModelDao dao = new ModelDao();
        return dao.quaryAll();
    }

    public ModelDetailEntity getModelDetail(ModelDetailParam param) {
        ModelDao modelDao = new ModelDao();
        AtlasDao atlasDao = new AtlasDao();
        PicDao picDao = new PicDao();
        ModelDetailEntity entity = new ModelDetailEntity();
        entity.setModelId(param.getModelId());
        ModelDetailEntity resultEntity = modelDao.quaryModel(entity);
        List<AtlasDetailEntity> atlasList = atlasDao.infoAllByModel(resultEntity.getModelId());
        for (int i = 0; i < atlasList.size(); i++) {
            AtlasDetailEntity detailEntity = atlasList.get(i);
            InfoAtlasParam infoAtlasParam = new InfoAtlasParam();
            infoAtlasParam.setAtlasId(detailEntity.getAtlasId());
            List<PicDetailEntity> piclist = picDao.infoPicList(infoAtlasParam);
            detailEntity.pics = piclist;
        }
        resultEntity.atlasList = atlasList;
        return resultEntity;
    }
}
