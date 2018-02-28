package model;

import javax.persistence.*;

@Entity
@Table(name = "model_detail", schema = "xianliao", catalog = "")
public class ModelDetailEntity {
    private int modelId;
    private String modelName;
    private String modelAvatar;
    private String modelBackground;
    private Integer modelWeight;
    private Integer modelHeight;
    private Integer modelWaistilne;
    private Integer modelBust;
    private Integer modelHipline;
    private String modelCover;
    private String modelMotto;
    private Integer modelFollowed;

    @Id
    @Column(name = "model_id")
    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "model_name")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Basic
    @Column(name = "model_avatar")
    public String getModelAvatar() {
        return modelAvatar;
    }

    public void setModelAvatar(String modelAvatar) {
        this.modelAvatar = modelAvatar;
    }

    @Basic
    @Column(name = "model_background")
    public String getModelBackground() {
        return modelBackground;
    }

    public void setModelBackground(String modelBackground) {
        this.modelBackground = modelBackground;
    }

    @Basic
    @Column(name = "model_weight")
    public Integer getModelWeight() {
        return modelWeight;
    }

    public void setModelWeight(Integer modelWeight) {
        this.modelWeight = modelWeight;
    }

    @Basic
    @Column(name = "model_height")
    public Integer getModelHeight() {
        return modelHeight;
    }

    public void setModelHeight(Integer modelHeight) {
        this.modelHeight = modelHeight;
    }

    @Basic
    @Column(name = "model_waistilne")
    public Integer getModelWaistilne() {
        return modelWaistilne;
    }

    public void setModelWaistilne(Integer modelWaistilne) {
        this.modelWaistilne = modelWaistilne;
    }

    @Basic
    @Column(name = "model_bust")
    public Integer getModelBust() {
        return modelBust;
    }

    public void setModelBust(Integer modelBust) {
        this.modelBust = modelBust;
    }

    @Basic
    @Column(name = "model_hipline")
    public Integer getModelHipline() {
        return modelHipline;
    }

    public void setModelHipline(Integer modelHipline) {
        this.modelHipline = modelHipline;
    }

    @Basic
    @Column(name = "model_cover")
    public String getModelCover() {
        return modelCover;
    }

    public void setModelCover(String modelCover) {
        this.modelCover = modelCover;
    }

    @Basic
    @Column(name = "model_motto")
    public String getModelMotto() {
        return modelMotto;
    }

    public void setModelMotto(String modelMotto) {
        this.modelMotto = modelMotto;
    }

    @Basic
    @Column(name = "model_followed")
    public Integer getModelFollowed() {
        return modelFollowed;
    }

    public void setModelFollowed(Integer modelFollowed) {
        this.modelFollowed = modelFollowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelDetailEntity that = (ModelDetailEntity) o;

        if (modelId != that.modelId) return false;
        if (modelName != null ? !modelName.equals(that.modelName) : that.modelName != null) return false;
        if (modelAvatar != null ? !modelAvatar.equals(that.modelAvatar) : that.modelAvatar != null) return false;
        if (modelBackground != null ? !modelBackground.equals(that.modelBackground) : that.modelBackground != null)
            return false;
        if (modelWeight != null ? !modelWeight.equals(that.modelWeight) : that.modelWeight != null) return false;
        if (modelHeight != null ? !modelHeight.equals(that.modelHeight) : that.modelHeight != null) return false;
        if (modelWaistilne != null ? !modelWaistilne.equals(that.modelWaistilne) : that.modelWaistilne != null)
            return false;
        if (modelBust != null ? !modelBust.equals(that.modelBust) : that.modelBust != null) return false;
        if (modelHipline != null ? !modelHipline.equals(that.modelHipline) : that.modelHipline != null) return false;
        if (modelCover != null ? !modelCover.equals(that.modelCover) : that.modelCover != null) return false;
        if (modelMotto != null ? !modelMotto.equals(that.modelMotto) : that.modelMotto != null) return false;
        if (modelFollowed != null ? !modelFollowed.equals(that.modelFollowed) : that.modelFollowed != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = modelId;
        result = 31 * result + (modelName != null ? modelName.hashCode() : 0);
        result = 31 * result + (modelAvatar != null ? modelAvatar.hashCode() : 0);
        result = 31 * result + (modelBackground != null ? modelBackground.hashCode() : 0);
        result = 31 * result + (modelWeight != null ? modelWeight.hashCode() : 0);
        result = 31 * result + (modelHeight != null ? modelHeight.hashCode() : 0);
        result = 31 * result + (modelWaistilne != null ? modelWaistilne.hashCode() : 0);
        result = 31 * result + (modelBust != null ? modelBust.hashCode() : 0);
        result = 31 * result + (modelHipline != null ? modelHipline.hashCode() : 0);
        result = 31 * result + (modelCover != null ? modelCover.hashCode() : 0);
        result = 31 * result + (modelMotto != null ? modelMotto.hashCode() : 0);
        result = 31 * result + (modelFollowed != null ? modelFollowed.hashCode() : 0);
        return result;
    }
}
