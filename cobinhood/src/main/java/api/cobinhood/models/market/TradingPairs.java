package api.cobinhood.models.market;

import api.cobinhood.models.BaseModel;

/**
 * Created by joel on 3/19/18.
 */

public class TradingPairs extends BaseModel {
    private TradingPairsResult result;

    public TradingPairsResult getResult() {
        return result;
    }

    public void setResult(TradingPairsResult result) {
        this.result = result;
    }
}
