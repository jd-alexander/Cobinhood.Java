package api.coinbinhood.errorhandling;

import java.util.List;
import java.util.Map;

/**
 * Created by joel on 3/17/18.
 */

public class CoinbinhoodError {

    private boolean success;
    List<Map<String, String>> error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Map<String, String>> getError() {
        return error;
    }

    public void setError(List<Map<String, String>> error) {
        this.error = error;
    }
}