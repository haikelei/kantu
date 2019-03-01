package service;

import dao.AtlasDao;
import dao.PicDao;
import model.AtlasDetailEntity;
import model.PicDetailEntity;
import model.params.AddAtlasParam;
import model.params.DeleteAtlasParam;
import model.params.InfoAtlasParam;
import model.params.UpdateAtlasParam;
import model.responses.AddAtlasResponse;
import model.responses.InfoAtlasResponse;

import java.util.ArrayList;
import java.util.List;

public class AtlasService {
    private static AtlasService instance;
    private AtlasService() {}
    public static synchronized AtlasService getInstance() {
        if (instance == null) {
            instance = new AtlasService();
        }
        return instance;
    }


    public AddAtlasResponse addAtlas(AddAtlasParam param) {

        AtlasDao dao = new AtlasDao();
        //创建图集
        AtlasDetailEntity atlasDetailEntity = param.toAtlasDetailEntity();
        int atlasId = dao.addAtlasDetail(atlasDetailEntity);
        //拿到图集id 创建图集图片详情
        ArrayList picList = new ArrayList();
        for (int i = 0; i < param.getList().size(); i++) {
            String url = param.getList().get(i).getPic();
            PicDetailEntity picDetailEntity = new PicDetailEntity();
            picDetailEntity.setAtlasId(atlasId);
            picDetailEntity.setModelId(param.getId());
            picDetailEntity.setIndexInAtlas(i);
            picDetailEntity.setUrl(url);
            //增加图片详情
            boolean result = dao.addPicDetail(picDetailEntity);
        }
        return new AddAtlasResponse(true);

    }

    public AddAtlasResponse deleteAtlas(DeleteAtlasParam param) {
        AtlasDao atlasDao = new AtlasDao();
        AtlasDetailEntity atlasDetailEntity = param.toAtlasDetailEntity();
        atlasDao.deleteAtlasDetail(atlasDetailEntity);

        PicDao picDao = new PicDao();
        picDao.deletePic(atlasDetailEntity);

        return new AddAtlasResponse(true);
    }


    /**
     * 查询atlas信息
     * @param param
     * @return
     */
    public InfoAtlasResponse infoAtlas(InfoAtlasParam param) {
        //查询atlsdetail信息
        AtlasDao atlasDao = new AtlasDao();
        AtlasDetailEntity atlasDetailEntity = atlasDao.infoAtlasDetail(param);

        //查询picdetali信息
        PicDao picDao = new PicDao();
        List<PicDetailEntity> list = picDao.infoPicList(param);

        return new InfoAtlasResponse(atlasDetailEntity,list);
    }


    /**
     * 更新图集
     * @param param
     */
    public AddAtlasResponse updateAtlas(UpdateAtlasParam param) {
        //更新atlasdetail信息
        AtlasDetailEntity atlasDetailEntity = param.toAtlasDetailEntity();
        AtlasDao atlasDao = new AtlasDao();
        atlasDao.updateAtlasDetai(atlasDetailEntity);

        //更新picdetail信息
        PicDao picDao = new PicDao();
        //根据atlasid删除图集所有图片
        picDao.deletePic(atlasDetailEntity);
        //添加图片detail
        List<UpdateAtlasParam.ListBean> list = param.getList();
        for (int i = 0; i < list.size(); i++) {
            UpdateAtlasParam.ListBean bean = list.get(i);
            PicDetailEntity picDetailEntity = new PicDetailEntity();
            picDetailEntity.setUrl(bean.getPic());
            picDetailEntity.setIndexInAtlas(i);
            picDetailEntity.setModelId(param.getId());
            picDetailEntity.setAtlasId(param.getAtlasId());
            atlasDao.addPicDetail(picDetailEntity);
        }

        return new AddAtlasResponse(true);

    }
}
