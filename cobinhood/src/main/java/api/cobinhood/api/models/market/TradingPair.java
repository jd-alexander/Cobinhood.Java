package api.cobinhood.api.models.market;

import java.math.BigDecimal;

/**
 * Created by joel on 3/19/18.
 */

public class TradingPair {
    private String id;
    private String baseCurrencyId;
    private String quoteCurrencyId;
    private BigDecimal baseMinSize;
    private BigDecimal baseMaxSize;
    private BigDecimal quoteIncrement;
    private boolean marginEnabled;
    private boolean isActive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBaseCurrencyId() {
        return baseCurrencyId;
    }

    public void setBaseCurrencyId(String baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    public String getQuoteCurrencyId() {
        return quoteCurrencyId;
    }

    public void setQuoteCurrencyId(String quoteCurrencyId) {
        this.quoteCurrencyId = quoteCurrencyId;
    }

    public BigDecimal getBaseMinSize() {
        return baseMinSize;
    }

    public void setBaseMinSize(BigDecimal baseMinSize) {
        this.baseMinSize = baseMinSize;
    }

    public BigDecimal getBaseMaxSize() {
        return baseMaxSize;
    }

    public void setBaseMaxSize(BigDecimal baseMaxSize) {
        this.baseMaxSize = baseMaxSize;
    }

    public BigDecimal getQuoteIncrement() {
        return quoteIncrement;
    }

    public void setQuoteIncrement(BigDecimal quoteIncrement) {
        this.quoteIncrement = quoteIncrement;
    }

    public boolean isMarginEnabled() {
        return marginEnabled;
    }

    public void setMarginEnabled(boolean marginEnabled) {
        this.marginEnabled = marginEnabled;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "TradingPair{" +
                "id='" + id + '\'' +
                ", baseCurrencyId='" + baseCurrencyId + '\'' +
                ", quoteCurrencyId='" + quoteCurrencyId + '\'' +
                ", baseMinSize=" + baseMinSize +
                ", baseMaxSize=" + baseMaxSize +
                ", quoteIncrement=" + quoteIncrement +
                ", marginEnabled=" + marginEnabled +
                ", isActive=" + isActive +
                '}';
    }
}

