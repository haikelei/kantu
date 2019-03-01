package model;

import javax.persistence.*;

@Entity
@Table(name = "pic_detail", schema = "xianliao", catalog = "")
public class PicDetailEntity {
    private Integer modelId;
    private Integer atlasId;
    private String url;
    private Integer indexInAtlas;
    private int index;


    @Basic
    @Column(name = "model_id")
    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "atlas_id")
    public Integer getAtlasId() {
        return atlasId;
    }

    public void setAtlasId(Integer atlasId) {
        this.atlasId = atlasId;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "index_in_atlas")
    public Integer getIndexInAtlas() {
        return indexInAtlas;
    }

    public void setIndexInAtlas(Integer indexInAtlas) {
        this.indexInAtlas = indexInAtlas;
    }

    @Id
    @Column(name = "index")
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PicDetailEntity that = (PicDetailEntity) o;

        if (index != that.index) return false;
        if (modelId != null ? !modelId.equals(that.modelId) : that.modelId != null) return false;
        if (atlasId != null ? !atlasId.equals(that.atlasId) : that.atlasId != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (indexInAtlas != null ? !indexInAtlas.equals(that.indexInAtlas) : that.indexInAtlas != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = modelId != null ? modelId.hashCode() : 0;
        result = 31 * result + (atlasId != null ? atlasId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (indexInAtlas != null ? indexInAtlas.hashCode() : 0);
        result = 31 * result + index;
        return result;
    }
}
