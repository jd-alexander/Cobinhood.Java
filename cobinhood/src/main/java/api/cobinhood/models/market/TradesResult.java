package api.cobinhood.models.market;

import java.util.List;

/**
 * Created by joel on 3/20/18.
 */

public class TradesResult {
    private List<TradeItem> trades;

    public List<TradeItem> getTrades() {
        return trades;
    }

    public void setTrades(List<TradeItem> trades) {
        this.trades = trades;
    }
}
