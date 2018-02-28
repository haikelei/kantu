package model.responses;

public class UpdateModelData {

    /**
     * result : true
     * id :
     */

    private boolean result;
    private int id;

    public UpdateModelData(boolean result, int id) {
        this.result = result;
        this.id = id;
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
}
