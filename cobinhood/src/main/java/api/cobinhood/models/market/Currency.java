package api.cobinhood.models.market;

import com.google.gson.annotations.SerializedName;

/**
 * Created by joel on 3/18/18.
 */

public class Currency {

    @SerializedName("currency")
    private String ticker;
    private String name;
    private String minUnit;
    private String depositFee;
    private String withdrawalFee;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    public String getDepositFee() {
        return depositFee;
    }

    public void setDepositFee(String depositFee) {
        this.depositFee = depositFee;
    }

    public String getWithdrawalFee() {
        return withdrawalFee;
    }

    public void setWithdrawalFee(String withdrawalFee) {
        this.withdrawalFee = withdrawalFee;
    }
}
