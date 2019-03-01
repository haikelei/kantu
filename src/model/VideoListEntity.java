package model;

import javax.persistence.*;

@Entity
@Table(name = "video_list", schema = "xianliao", catalog = "")
public class VideoListEntity {
    private int videoId;
    private String videoUrl;
    private String videoTitle;
    private Integer videoZan;
    private Integer videoCollect;
    private String videoCover;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "video_id")
    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    @Basic
    @Column(name = "video_url")
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Basic
    @Column(name = "video_title")
    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    @Basic
    @Column(name = "video_zan")
    public Integer getVideoZan() {
        return videoZan;
    }

    public void setVideoZan(Integer videoZan) {
        this.videoZan = videoZan;
    }

    @Basic
    @Column(name = "video_collect")
    public Integer getVideoCollect() {
        return videoCollect;
    }

    public void setVideoCollect(Integer videoCollect) {
        this.videoCollect = videoCollect;
    }

    @Basic
    @Column(name = "video_cover")
    public String getVideoCover() {
        return videoCover;
    }

    public void setVideoCover(String videoCover) {
        this.videoCover = videoCover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoListEntity that = (VideoListEntity) o;

        if (videoId != that.videoId) return false;
        if (videoUrl != null ? !videoUrl.equals(that.videoUrl) : that.videoUrl != null) return false;
        if (videoTitle != null ? !videoTitle.equals(that.videoTitle) : that.videoTitle != null) return false;
        if (videoZan != null ? !videoZan.equals(that.videoZan) : that.videoZan != null) return false;
        if (videoCollect != null ? !videoCollect.equals(that.videoCollect) : that.videoCollect != null) return false;
        if (videoCover != null ? !videoCover.equals(that.videoCover) : that.videoCover != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = videoId;
        result = 31 * result + (videoUrl != null ? videoUrl.hashCode() : 0);
        result = 31 * result + (videoTitle != null ? videoTitle.hashCode() : 0);
        result = 31 * result + (videoZan != null ? videoZan.hashCode() : 0);
        result = 31 * result + (videoCollect != null ? videoCollect.hashCode() : 0);
        result = 31 * result + (videoCover != null ? videoCover.hashCode() : 0);
        return result;
    }
}
