package model.params;

import model.AtlasDetailEntity;

import java.util.List;

public class AddAtlasParam {

    /**
     * id :
     * cover :
     * title :
     * des :
     * time :
     * collect :
     * download :
     * list : [{"pic":""},{"pic":""}]
     */

    private int id;
    private String cover;
    private String title;
    private String des;
    private int time;
    private int collect;
    private int download;
    private List<ListBean> list;
    public int type;

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

        @Override
        public String toString() {
            return "ListBean{" +
                    "pic='" + pic + '\'' +
                    '}';
        }
    }


    public AtlasDetailEntity toAtlasDetailEntity() {
        AtlasDetailEntity entity = new AtlasDetailEntity();
        entity.setAtlasCollected(collect);
        entity.setAtlasCover(cover);
        entity.setAtlasDes(des);
        entity.setAtlasDownload(download);
        entity.setModelId(id);
        entity.setAtlasTime(time);
        entity.setAtlasTitle(title);
        entity.setAtlasCount(list.size());
        entity.setType(type);
        return entity;
    }

    @Override
    public String toString() {
        return "AddAtlasParam{" +
                "id=" + id +
                ", cover='" + cover + '\'' +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                ", time=" + time +
                ", collect=" + collect +
                ", download=" + download +
                ", list=" + list +
                ", type=" + type +
                '}';
    }
}
