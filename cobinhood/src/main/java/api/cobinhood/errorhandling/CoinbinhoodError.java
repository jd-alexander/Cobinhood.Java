package api.cobinhood.errorhandling;

/**
 * Created by joel on 3/17/18.
 */

public class CoinbinhoodError {
    private Error error;
    private String requestId;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}