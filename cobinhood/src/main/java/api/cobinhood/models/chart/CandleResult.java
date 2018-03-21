package api.cobinhood.models.chart;

import java.util.List;

/**
 * Created by joel on 3/21/18.
 */

public class CandleResult {
    private List<CandleItem> candles;

    public List<CandleItem> getCandles() {
        return candles;
    }

    public void setCandles(List<CandleItem> candles) {
        this.candles = candles;
    }
}
