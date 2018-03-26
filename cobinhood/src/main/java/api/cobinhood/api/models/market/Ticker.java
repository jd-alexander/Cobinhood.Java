package api.cobinhood.api.models.market;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by joel on 3/19/18.
 */

public class Ticker {
    private String tradingPairId;
    private Date timestamp;
    @SerializedName("24h_high")
    private BigDecimal _24hHigh;
    @SerializedName("24h_low")
    private BigDecimal _24hLow;
    @SerializedName("24h_open")
    private BigDecimal _24hOpen;
    @SerializedName("24h_volume")
    private BigDecimal _24hVolume;
    private BigDecimal lastTradePrice;
    private BigDecimal highestBid;
    private BigDecimal lowestAsk;

    public String getTradingPairId() {
        return tradingPairId;
    }

    public void setTradingPairId(String tradingPairId) {
        this.tradingPairId = tradingPairId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal get_24hHigh() {
        return _24hHigh;
    }

    public void set_24hHigh(BigDecimal _24hHigh) {
        this._24hHigh = _24hHigh;
    }

    public BigDecimal get_24hLow() {
        return _24hLow;
    }

    public void set_24hLow(BigDecimal _24hLow) {
        this._24hLow = _24hLow;
    }

    public BigDecimal get_24hOpen() {
        return _24hOpen;
    }

    public void set_24hOpen(BigDecimal _24hOpen) {
        this._24hOpen = _24hOpen;
    }

    public BigDecimal get_24hVolume() {
        return _24hVolume;
    }

    public void set_24hVolume(BigDecimal _24hVolume) {
        this._24hVolume = _24hVolume;
    }

    public BigDecimal getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(BigDecimal lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public BigDecimal getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(BigDecimal highestBid) {
        this.highestBid = highestBid;
    }

    public BigDecimal getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(BigDecimal lowestAsk) {
        this.lowestAsk = lowestAsk;
    }
}
