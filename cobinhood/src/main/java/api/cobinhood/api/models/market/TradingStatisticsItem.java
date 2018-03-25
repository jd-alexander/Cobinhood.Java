package api.cobinhood.api.models.market;

import com.google.gson.annotations.SerializedName;

/**
 * Created by joel on 3/19/18.
 */

public class TradingStatisticsItem {

    private String id;
    private String lastPrice;
    private String lowestAsk;
    private String highestBid;
    private String baseVolume;
    private String quoteVolume;
    private String isFrozen;
    @SerializedName("high_24hr")
    private String high24hr;
    @SerializedName("low_24hr")
    private String low24hr;
    private String percentChanged24hr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(String lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public String getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(String highestBid) {
        this.highestBid = highestBid;
    }

    public String getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(String baseVolume) {
        this.baseVolume = baseVolume;
    }

    public String getQuoteVolume() {
        return quoteVolume;
    }

    public void setQuoteVolume(String quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    public String getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    public String getHigh24hr() {
        return high24hr;
    }

    public void setHigh24hr(String high24hr) {
        this.high24hr = high24hr;
    }

    public String getLow24hr() {
        return low24hr;
    }

    public void setLow24hr(String low24hr) {
        this.low24hr = low24hr;
    }

    public String getPercentChanged24hr() {
        return percentChanged24hr;
    }

    public void setPercentChanged24hr(String percentChanged24hr) {
        this.percentChanged24hr = percentChanged24hr;
    }
}
