package api.cobinhood.api.models.market;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by joel on 3/19/18.
 */

public class Ticker {
    private String tradingPairId;
    private Date timestamp;
    @SerializedName("24h_high")
    private String _24hHigh;
    @SerializedName("24h_low")
    private String _24hLow;
    @SerializedName("24h_open")
    private String _24hOpen;
    @SerializedName("24h_volume")
    private String _24hVolume;
    private String lastTradePrice;
    private String highestBid;
    private String lowestAsk;

    public String getTradingPairId() {
        return tradingPairId;
    }

    public void setTradingPairId(String tradingPairId) {
        this.tradingPairId = tradingPairId;
    }

    public String get_24hHigh() {
        return _24hHigh;
    }

    public void set_24hHigh(String _24hHigh) {
        this._24hHigh = _24hHigh;
    }

    public String get_24hLow() {
        return _24hLow;
    }

    public void set_24hLow(String _24hLow) {
        this._24hLow = _24hLow;
    }

    public String get_24hOpen() {
        return _24hOpen;
    }

    public void set_24hOpen(String _24hOpen) {
        this._24hOpen = _24hOpen;
    }

    public String get_24hVolume() {
        return _24hVolume;
    }

    public void set_24hVolume(String _24hVolume) {
        this._24hVolume = _24hVolume;
    }

    public String getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(String lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public String getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(String highestBid) {
        this.highestBid = highestBid;
    }

    public String getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(String lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
