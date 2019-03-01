package model.params;

public class DeleteVideoParam {

    /**
     * videoId : 2
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
        return "DeleteVideoParam{" +
                "videoId=" + videoId +
                '}';
    }
}
