package service;

import dao.AtlasDao;
import dao.ModelDao;
import dao.PicDao;
import model.AtlasDetailEntity;
import model.ModelDetailEntity;
import model.PicDetailEntity;
import model.params.InfoAtlasParam;

import java.util.List;

public class AppAtlasService {

    private static AppAtlasService instance;
    private AppAtlasService() {}
    public static synchronized AppAtlasService getInstance() {
        if (instance == null) {
            instance = new AppAtlasService();
        }
        return instance;
    }

    public List<AtlasDetailEntity> getLatestAtlas(){
        AtlasDao dao = new AtlasDao();
        ModelDao modeldao = new ModelDao();
        List<AtlasDetailEntity> list =  dao.infoAllByTime();//查询出来的modelAvatar是没有的 需要再手动添加
        for (int i = 0; i < list.size(); i++) {
            AtlasDetailEntity entity = list.get(i);
            int modelId = entity.getModelId();
            ModelDetailEntity modelDetailEntity = new ModelDetailEntity();
            modelDetailEntity.setModelId(modelId);
            ModelDetailEntity resultModel = modeldao.quaryModel(modelDetailEntity);
            entity.modelAvatar = resultModel.getModelAvatar();
            entity.modelName = resultModel.getModelName();
        }
        return list;
    }

    public List<AtlasDetailEntity> getHotAtlas() {
        AtlasDao dao = new AtlasDao();
        ModelDao modeldao = new ModelDao();
        List<AtlasDetailEntity> list =  dao.infoAllByHot();
        for (int i = 0; i < list.size(); i++) {
            AtlasDetailEntity entity = list.get(i);
            int modelId = entity.getModelId();
            ModelDetailEntity modelDetailEntity = new ModelDetailEntity();
            modelDetailEntity.setModelId(modelId);
            ModelDetailEntity resultModel = modeldao.quaryModel(modelDetailEntity);
            entity.modelAvatar = resultModel.getModelAvatar();
            entity.modelName = resultModel.getModelName();
        }
        return list;
    }

    public List<AtlasDetailEntity> getPrivateAtlas() {
        AtlasDao atlasDao = new AtlasDao();
        ModelDao modeldao = new ModelDao();
        PicDao picDao = new PicDao();
        List<AtlasDetailEntity> list = atlasDao.infoPrivate();
        for (int i = 0; i < list.size(); i++) {
            AtlasDetailEntity entity = list.get(i);
            int modelId = entity.getModelId();
            ModelDetailEntity modelDetailEntity = new ModelDetailEntity();
            modelDetailEntity.setModelId(modelId);
            ModelDetailEntity resultModel = modeldao.quaryModel(modelDetailEntity);
            entity.modelAvatar = resultModel.getModelAvatar();
            entity.modelName = resultModel.getModelName();
            InfoAtlasParam param = new InfoAtlasParam();
            param.setAtlasId(entity.getAtlasId());
            List<PicDetailEntity> pics = picDao.infoPicList(param);
            entity.pics = pics;
        }


        return list;
    }
}
