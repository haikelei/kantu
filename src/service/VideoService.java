package service;

import dao.VideoDao;
import model.VideoListEntity;
import model.params.AddVideoParam;
import model.params.DeleteVideoParam;
import model.params.InfoVideoList;
import model.params.UpdateVideoParam;
import model.responses.AddAtlasResponse;
import model.responses.InfoVideoResponse;

public class VideoService {
    private static VideoService instance;
    private VideoService() {}
    public static synchronized VideoService getInstance() {
        if (instance == null) {
            instance = new VideoService();
        }
        return instance;
    }

    public AddAtlasResponse addVideo(AddVideoParam param) {
        VideoListEntity videoListEntity = param.toVideoListEntity();
        VideoDao videoDao = new VideoDao();
        videoDao.addVideo(videoListEntity);
        return new AddAtlasResponse(true);
    }


    public InfoVideoResponse infoVideo(InfoVideoList param) {
        VideoDao videoDao = new VideoDao();
        VideoListEntity videoListEntity = videoDao.infoVideoDetail(param.getVideoId());
        InfoVideoResponse infoVideoResponse = new InfoVideoResponse();
        infoVideoResponse.setCollect(videoListEntity.getVideoCollect());
        infoVideoResponse.setCover(videoListEntity.getVideoCover());
        infoVideoResponse.setTitle(videoListEntity.getVideoTitle());
        infoVideoResponse.setUrl(videoListEntity.getVideoUrl());
        infoVideoResponse.setVideoId(videoListEntity.getVideoId());
        infoVideoResponse.setZan(videoListEntity.getVideoZan());
        return infoVideoResponse;
    }


    public AddAtlasResponse deleteVideo(DeleteVideoParam param) {
        VideoDao videoDao = new VideoDao();
        videoDao.deleteVideo(param.getVideoId());
        return new AddAtlasResponse(true);
    }

    public AddAtlasResponse updateVideo(UpdateVideoParam param) {
        VideoListEntity videoListEntity = param.toVideoListEntity();
        VideoDao videoDao = new VideoDao();
        videoDao.updateVideo(videoListEntity);

        return new AddAtlasResponse(true);
    }
}