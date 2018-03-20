package api.cobinhood.models.market;

import java.util.List;

/**
 * Created by joel on 3/19/18.
 */

public class TradingPairsResult {
    private List<TradingPairItem> tradingPairs;

    public List<TradingPairItem> getTradingPairs() {
        return tradingPairs;
    }

    public void setTradingPairs(List<TradingPairItem> tradingPairs) {
        this.tradingPairs = tradingPairs;
    }
}
