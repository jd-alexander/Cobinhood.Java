package api.cobinhood.api.models;

/**
 * Created by joel on 3/26/18.
 */

public class MapResponse<T> {

    private T result;
    private boolean success;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}