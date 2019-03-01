package model.responses;

import model.AtlasDetailEntity;

import java.util.List;

public class AtlasListResponse {

    private List<AtlasDetailEntity> list;

    public List<AtlasDetailEntity> getList() {
        return list;
    }

    public void setList(List<AtlasDetailEntity> list) {
        this.list = list;
    }
}
