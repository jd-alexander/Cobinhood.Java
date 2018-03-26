package api.cobinhood.api.models.wallet;

import java.math.BigDecimal;

/**
 * Created by joel on 3/23/18.
 */

public class Balance {

    private String currency;
    private String type;
    private BigDecimal total;
    private BigDecimal onOrder;
    private Boolean locked;
    private BigDecimal usdValue;
    private BigDecimal btcValue;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getOnOrder() {
        return onOrder;
    }

    public void setOnOrder(BigDecimal onOrder) {
        this.onOrder = onOrder;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public BigDecimal getUsdValue() {
        return usdValue;
    }

    public void setUsdValue(BigDecimal usdValue) {
        this.usdValue = usdValue;
    }

    public BigDecimal getBtcValue() {
        return btcValue;
    }

    public void setBtcValue(BigDecimal btcValue) {
        this.btcValue = btcValue;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "currency='" + currency + '\'' +
                ", type='" + type + '\'' +
                ", total=" + total +
                ", onOrder=" + onOrder +
                ", locked=" + locked +
                ", usdValue=" + usdValue +
                ", btcValue=" + btcValue +
                '}';
    }
}
