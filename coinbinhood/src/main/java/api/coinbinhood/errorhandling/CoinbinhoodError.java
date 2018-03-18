package api.coinbinhood.errorhandling;

/**
 * Created by joel on 3/17/18.
 */

public class CoinbinhoodError {
    private Integer mErrorCode;

    private String mErrorMessage;

    public int getErrorCode() {
        return mErrorCode;
    }

    public String getErrorMessage() {
        return mErrorMessage;
    }
}