package service;

import dao.AtlasDao;
import model.AtlasDetailEntity;
import model.PicDetailEntity;
import model.params.AddAtlasParam;
import model.responses.AddAtlasResponse;

import java.util.ArrayList;

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
}
