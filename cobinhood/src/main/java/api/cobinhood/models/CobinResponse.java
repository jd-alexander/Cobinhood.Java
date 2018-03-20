package api.cobinhood.models;


/**
 * Created by joel on 3/19/18.
 */

public abstract class CobinResponse<T> {
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
