package model.responses;

import model.ModelDetailEntity;

public class ResAddModel {

    /**
     * result : true
     * id :
     * name :
     */

    private boolean result;
    private int id;
    private String name;

    public ResAddModel(boolean result) {
        this.result = result;
    }

    public ResAddModel(ModelDetailEntity entity) {
        if(entity != null){
            this.result = true;
            this.id = entity.getModelId();
            this.name = entity.getModelName();
        }

    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
