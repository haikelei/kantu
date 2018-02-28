package model.params;

import model.ModelDetailEntity;

public class ModelParam {

    /**
     * name :
     * avatar :
     * background :
     * weight : 0
     * height : 0
     * waistiline : 0
     * hipline : 0
     * bust : 0
     * cover :
     * motto :
     * follow : 0
     */

    private String name;
    private String avatar;
    private String background;
    private int weight;
    private int height;
    private int waistiline;
    private int hipline;
    private int bust;
    private String cover;
    private String motto;
    private int follow;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWaistiline() {
        return waistiline;
    }

    public void setWaistiline(int waistiline) {
        this.waistiline = waistiline;
    }

    public int getHipline() {
        return hipline;
    }

    public void setHipline(int hipline) {
        this.hipline = hipline;
    }

    public int getBust() {
        return bust;
    }

    public void setBust(int bust) {
        this.bust = bust;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public int getFollow() {
        return follow;
    }

    public void setFollow(int follow) {
        this.follow = follow;
    }

    @Override
    public String toString() {
        return "ModelParam{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", background='" + background + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", waistiline=" + waistiline +
                ", hipline=" + hipline +
                ", bust=" + bust +
                ", cover='" + cover + '\'' +
                ", motto='" + motto + '\'' +
                ", follow=" + follow +
                '}';
    }

    public ModelDetailEntity toModelDetailEntity(){
        ModelDetailEntity entity = new ModelDetailEntity();
        entity.setModelAvatar(this.avatar);
        entity.setModelBackground(this.background);
        entity.setModelBust(this.bust);
        entity.setModelCover(this.cover);
        entity.setModelFollowed(this.follow);
        entity.setModelHeight(this.height);
        entity.setModelHipline(this.hipline);
        entity.setModelWeight(this.weight);
        entity.setModelMotto(this.motto);
        entity.setModelName(this.name);
        entity.setModelWaistilne(this.waistiline);
        return entity;
    }
}
