package model.responses;

import model.AtlasDetailEntity;
import model.PicDetailEntity;

import java.util.ArrayList;
import java.util.List;

public class InfoAtlasResponse {

    /**
     * id : 0
     * cover :
     * title :
     * des :
     * time : 0
     * collect : 0
     * download : 0
     * count : 0
     * list : [{"pic":""},{"pic":""}]
     */

    private int id;
    private String cover;
    private String title;
    private String des;
    private int time;
    private int collect;
    private int download;
    private int count;
    private List<ListBean> list;

    public InfoAtlasResponse(AtlasDetailEntity atlasDetailEntity, List<PicDetailEntity> listPic) {
        id = atlasDetailEntity.getModelId();
        cover = atlasDetailEntity.getAtlasCover();
        title = atlasDetailEntity.getAtlasTitle();
        des = atlasDetailEntity.getAtlasDes();
        time = atlasDetailEntity.getAtlasTime();
        collect = atlasDetailEntity.getAtlasCollected();
        download = atlasDetailEntity.getAtlasDownload();
        count = atlasDetailEntity.getAtlasCount();
        list = new ArrayList<ListBean>();
        for (int i = 0; i < listPic.size(); i++) {
            ListBean bean = new ListBean();
            bean.setPic(listPic.get(i).getUrl());
            list.add(bean);
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCollect() {
        return collect;
    }

    public void setCollect(int collect) {
        this.collect = collect;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * pic :
         */

        private String pic;

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }
    }
}
