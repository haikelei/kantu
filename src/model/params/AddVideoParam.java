package model.params;

import model.VideoListEntity;

public class AddVideoParam {

    /**
     * cover :
     * url :
     * title :
     * zan : 0
     * collect : 0
     */

    private String cover;
    private String url;
    private String title;
    private int zan;
    private int collect;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getZan() {
        return zan;
    }

    public void setZan(int zan) {
        this.zan = zan;
    }

    public int getCollect() {
        return collect;
    }

    public void setCollect(int collect) {
        this.collect = collect;
    }

    public VideoListEntity toVideoListEntity() {
        VideoListEntity videoListEntity = new VideoListEntity();
        videoListEntity.setVideoCollect(collect);
        videoListEntity.setVideoCover(cover);
        videoListEntity.setVideoTitle(title);
        videoListEntity.setVideoUrl(url);
        videoListEntity.setVideoZan(zan);
        return videoListEntity;
    }

    @Override
    public String toString() {
        return "AddVideoParam{" +
                "cover='" + cover + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", zan=" + zan +
                ", collect=" + collect +
                '}';
    }
}
