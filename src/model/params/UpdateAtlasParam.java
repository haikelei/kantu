package model.params;

import model.AtlasDetailEntity;

import java.util.List;

public class UpdateAtlasParam {

    /**
     * atlasId : 12
     * id : 0
     * cover :
     * title :
     * des :
     * time : 0
     * collect : 0
     * download : 0
     * list : [{"pic":""},{"pic":""}]
     */

    private int atlasId;
    private int id;
    private String cover;
    private String title;
    private String des;
    private int time;
    private int collect;
    private int download;
    private List<ListBean> list;

    public int getAtlasId() {
        return atlasId;
    }

    public void setAtlasId(int atlasId) {
        this.atlasId = atlasId;
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

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public AtlasDetailEntity toAtlasDetailEntity() {
        AtlasDetailEntity atlasDetailEntity = new AtlasDetailEntity();
        atlasDetailEntity.setAtlasId(atlasId);
        atlasDetailEntity.setModelId(id);
        atlasDetailEntity.setAtlasTitle(title);
        atlasDetailEntity.setAtlasDownload(download);
        atlasDetailEntity.setAtlasDes(des);
        atlasDetailEntity.setAtlasCover(cover);
        atlasDetailEntity.setAtlasCollected(collect);
        atlasDetailEntity.setAtlasTime(time);
        return atlasDetailEntity;
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

    @Override
    public String toString() {
        return "UpdateAtlasParam{" +
                "atlasId=" + atlasId +
                ", id=" + id +
                ", cover='" + cover + '\'' +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                ", time=" + time +
                ", collect=" + collect +
                ", download=" + download +
                ", list=" + list +
                '}';
    }
}
