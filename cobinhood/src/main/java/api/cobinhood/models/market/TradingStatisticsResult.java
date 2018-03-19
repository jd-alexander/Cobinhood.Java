package api.cobinhood.models.market;

import java.util.List;

/**
 * Created by joel on 3/19/18.
 */

public class TradingStatisticsResult {

    private List<TradingStatisticsItem> tradingStaticDetails;

    public List<TradingStatisticsItem> getTradingStaticDetails() {
        return tradingStaticDetails;
    }

    public void setTradingStaticDetails(List<TradingStatisticsItem> tradingStaticDetails) {
        this.tradingStaticDetails = tradingStaticDetails;
    }
}
