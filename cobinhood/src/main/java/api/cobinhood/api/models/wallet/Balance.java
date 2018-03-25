package api.cobinhood.api.models.wallet;

/**
 * Created by joel on 3/23/18.
 */

public class Balance {

    private String currency;
    private String type;
    private String total;
    private String onOrder;
    private Boolean locked;
    private double usdValue;
    private double btcValue;

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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getOnOrder() {
        return onOrder;
    }

    public void setOnOrder(String onOrder) {
        this.onOrder = onOrder;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public double getUsdValue() {
        return usdValue;
    }

    public void setUsdValue(double usdValue) {
        this.usdValue = usdValue;
    }

    public double getBtcValue() {
        return btcValue;
    }

    public void setBtcValue(double btcValue) {
        this.btcValue = btcValue;
    }
}
