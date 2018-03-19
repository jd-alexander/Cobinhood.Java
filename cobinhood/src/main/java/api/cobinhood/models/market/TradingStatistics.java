package api.cobinhood.models.market;

import java.util.Map;

import api.cobinhood.models.BaseModel;

/**
 * Created by joel on 3/19/18.
 */

public class TradingStatistics extends BaseModel {

    private Map<String,TradingStatisticsResult> result;

    public Map<String, TradingStatisticsResult> getResult() {
        return result;
    }

    public void setResult(Map<String, TradingStatisticsResult> result) {
        this.result = result;
    }
}
