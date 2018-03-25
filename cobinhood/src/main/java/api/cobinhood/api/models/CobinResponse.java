package api.cobinhood.api.models;


/**
 * Created by joel on 3/19/18.
 */

public class CobinResponse<T> {

    private CobinResult<T> result;
    private boolean success;

    public T getResult() {
        return result.getValue();
    }

    public void setResult(CobinResult<T> result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
