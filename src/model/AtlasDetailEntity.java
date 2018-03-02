package model;

import javax.persistence.*;

@Entity
@Table(name = "atlas_detail", schema = "xianliao", catalog = "")
public class AtlasDetailEntity {
    private int atlasId;
    private Integer modelId;
    private String atlasCover;
    private String atlasTitle;
    private String atlasDes;
    private Integer atlasTime;
    private Integer atlasCollected;
    private Integer atlasDownload;
    private Integer atlasCount;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "atlas_id")
    public int getAtlasId() {
        return atlasId;
    }

    public void setAtlasId(int atlasId) {
        this.atlasId = atlasId;
    }

    @Basic
    @Column(name = "model_id")
    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "atlas_cover")
    public String getAtlasCover() {
        return atlasCover;
    }

    public void setAtlasCover(String atlasCover) {
        this.atlasCover = atlasCover;
    }

    @Basic
    @Column(name = "atlas_title")
    public String getAtlasTitle() {
        return atlasTitle;
    }

    public void setAtlasTitle(String atlasTitle) {
        this.atlasTitle = atlasTitle;
    }

    @Basic
    @Column(name = "atlas_des")
    public String getAtlasDes() {
        return atlasDes;
    }

    public void setAtlasDes(String atlasDes) {
        this.atlasDes = atlasDes;
    }

    @Basic
    @Column(name = "atlas_time")
    public Integer getAtlasTime() {
        return atlasTime;
    }

    public void setAtlasTime(Integer atlasTime) {
        this.atlasTime = atlasTime;
    }

    @Basic
    @Column(name = "atlas_collected")
    public Integer getAtlasCollected() {
        return atlasCollected;
    }

    public void setAtlasCollected(Integer atlasCollected) {
        this.atlasCollected = atlasCollected;
    }

    @Basic
    @Column(name = "atlas_download")
    public Integer getAtlasDownload() {
        return atlasDownload;
    }

    public void setAtlasDownload(Integer atlasDownload) {
        this.atlasDownload = atlasDownload;
    }

    @Basic
    @Column(name = "atlas_count")
    public Integer getAtlasCount() {
        return atlasCount;
    }

    public void setAtlasCount(Integer atlasCount) {
        this.atlasCount = atlasCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AtlasDetailEntity entity = (AtlasDetailEntity) o;

        if (atlasId != entity.atlasId) return false;
        if (modelId != null ? !modelId.equals(entity.modelId) : entity.modelId != null) return false;
        if (atlasCover != null ? !atlasCover.equals(entity.atlasCover) : entity.atlasCover != null) return false;
        if (atlasTitle != null ? !atlasTitle.equals(entity.atlasTitle) : entity.atlasTitle != null) return false;
        if (atlasDes != null ? !atlasDes.equals(entity.atlasDes) : entity.atlasDes != null) return false;
        if (atlasTime != null ? !atlasTime.equals(entity.atlasTime) : entity.atlasTime != null) return false;
        if (atlasCollected != null ? !atlasCollected.equals(entity.atlasCollected) : entity.atlasCollected != null)
            return false;
        if (atlasDownload != null ? !atlasDownload.equals(entity.atlasDownload) : entity.atlasDownload != null)
            return false;
        if (atlasCount != null ? !atlasCount.equals(entity.atlasCount) : entity.atlasCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = atlasId;
        result = 31 * result + (modelId != null ? modelId.hashCode() : 0);
        result = 31 * result + (atlasCover != null ? atlasCover.hashCode() : 0);
        result = 31 * result + (atlasTitle != null ? atlasTitle.hashCode() : 0);
        result = 31 * result + (atlasDes != null ? atlasDes.hashCode() : 0);
        result = 31 * result + (atlasTime != null ? atlasTime.hashCode() : 0);
        result = 31 * result + (atlasCollected != null ? atlasCollected.hashCode() : 0);
        result = 31 * result + (atlasDownload != null ? atlasDownload.hashCode() : 0);
        result = 31 * result + (atlasCount != null ? atlasCount.hashCode() : 0);
        return result;
    }
}
