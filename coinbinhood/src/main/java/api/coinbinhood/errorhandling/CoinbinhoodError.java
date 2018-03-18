package api.coinbinhood.errorhandling;

import java.util.List;
import java.util.Map;

/**
 * Created by joel on 3/17/18.
 */

public class CoinbinhoodError {

    List<Map<String, String>> error;

    public List<Map<String, String>> getError() {
        return error;
    }

    public void setError(List<Map<String, String>> error) {
        this.error = error;
    }
}