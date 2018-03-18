package api.coinbinhood.models;

import api.coinbinhood.errorhandling.CoinbinhoodError;

/**
 * Created by joel on 3/18/18.
 */

public abstract class BaseModel {

    private boolean success;
    private CoinbinhoodError error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public CoinbinhoodError getError() {
        return error;
    }

    public void setError(CoinbinhoodError error) {
        this.error = error;
    }
}
