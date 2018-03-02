package model.responses;

public class AddAtlasResponse {

    /**
     * result : true
     */

    private boolean result;

    public AddAtlasResponse(boolean result) {
        this.result = result;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
