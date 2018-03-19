package api.cobinhood.models.market;

import api.cobinhood.models.BaseModel;

/**
 * Created by joel on 3/19/18.
 */

public class Ticker extends BaseModel {
    private TickerResult result;

    public TickerResult getResult() {
        return result;
    }

    public void setResult(TickerResult result) {
        this.result = result;
    }
}
