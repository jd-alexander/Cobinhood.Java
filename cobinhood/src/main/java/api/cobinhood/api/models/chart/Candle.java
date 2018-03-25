package api.cobinhood.api.models.chart;

import java.util.Date;

/**
 * Created by joel on 3/21/18.
 */

public class Candle {

    private String timeframe;
    private String tradingPairId;
    private Date timestamp;
    private String volume;
    private String open;
    private String close;
    private String high;
    private String low;

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    public String getTradingPairId() {
        return tradingPairId;
    }

    public void setTradingPairId(String tradingPairId) {
        this.tradingPairId = tradingPairId;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
