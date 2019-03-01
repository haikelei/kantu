package model.params;

public class InfoVideoList {

    /**
     * videoId : 1
     */

    private int videoId;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    @Override
    public String toString() {
        return "InfoVideoList{" +
                "videoId=" + videoId +
                '}';
    }
}
