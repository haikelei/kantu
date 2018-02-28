package model.params;

import model.ModelDetailEntity;

public class ModelDeleteParam {

    /**
     * id : 1
     */

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ModelDeleteParam{" +
                "id=" + id +
                '}';
    }

    public ModelDetailEntity toModelDetailEntity() {
        ModelDetailEntity entity = new ModelDetailEntity();
        entity.setModelId(id);
        return entity;
    }
}
