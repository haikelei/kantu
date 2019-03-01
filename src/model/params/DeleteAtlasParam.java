package model.params;

import model.AtlasDetailEntity;

public class DeleteAtlasParam {

    /**
     * atlasId :
     */

    private int atlasId;

    public int getAtlasId() {
        return atlasId;
    }

    public void setAtlasId(int atlasId) {
        this.atlasId = atlasId;
    }

    public DeleteAtlasParam() {
    }

    public DeleteAtlasParam(int atlasId) {
        this.atlasId = atlasId;
    }

    public AtlasDetailEntity toAtlasDetailEntity() {
        AtlasDetailEntity entity = new AtlasDetailEntity();
        entity.setAtlasId(atlasId);
        return entity;
    }

    @Override
    public String toString() {
        return "DeleteAtlasParam{" +
                "atlasId=" + atlasId +
                '}';
    }
}
