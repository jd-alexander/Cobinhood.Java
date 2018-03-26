package api.cobinhood.api.models.market;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * Created by joel on 3/19/18.
 */

public class TradingStatistics {

    private String id;
    private BigDecimal lastPrice;
    private BigDecimal lowestAsk;
    private BigDecimal highestBid;
    private BigDecimal baseVolume;
    private BigDecimal quoteVolume;
    private boolean isFrozen;
    @SerializedName("high_24hr")
    private BigDecimal high24hr;
    @SerializedName("low_24hr")
    private BigDecimal low24hr;
    @SerializedName("percent_changed_24hr")
    private BigDecimal percentChanged24hr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public BigDecimal getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(BigDecimal lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public BigDecimal getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(BigDecimal highestBid) {
        this.highestBid = highestBid;
    }

    public BigDecimal getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(BigDecimal baseVolume) {
        this.baseVolume = baseVolume;
    }

    public BigDecimal getQuoteVolume() {
        return quoteVolume;
    }

    public void setQuoteVolume(BigDecimal quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    public BigDecimal getHigh24hr() {
        return high24hr;
    }

    public void setHigh24hr(BigDecimal high24hr) {
        this.high24hr = high24hr;
    }

    public BigDecimal getLow24hr() {
        return low24hr;
    }

    public void setLow24hr(BigDecimal low24hr) {
        this.low24hr = low24hr;
    }

    public BigDecimal getPercentChanged24hr() {
        return percentChanged24hr;
    }

    public void setPercentChanged24hr(BigDecimal percentChanged24hr) {
        this.percentChanged24hr = percentChanged24hr;
    }

    @Override
    public String toString() {
        return "TradingStatistics{" +
                "id='" + id + '\'' +
                ", lastPrice=" + lastPrice +
                ", lowestAsk=" + lowestAsk +
                ", highestBid=" + highestBid +
                ", baseVolume=" + baseVolume +
                ", quoteVolume=" + quoteVolume +
                ", isFrozen=" + isFrozen +
                ", high24hr=" + high24hr +
                ", low24hr=" + low24hr +
                ", percentChanged24hr=" + percentChanged24hr +
                '}';
    }
}
