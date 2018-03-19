package api.cobinhood.models.market;

import java.util.List;

/**
 * Created by joel on 3/19/18.
 */

public class TradingPairsResult {
    private List<TradingPair> tradingPairs;

    public List<TradingPair> getTradingPairs() {
        return tradingPairs;
    }

    public void setTradingPairs(List<TradingPair> tradingPairs) {
        this.tradingPairs = tradingPairs;
    }
}
