package api.cobinhood.api.models.market;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * Created by joel on 3/18/18.
 */

public class Currency {

    @SerializedName("currency")
    private String ticker;
    private String name;
    private String type;
    private boolean isActive;
    private boolean marginEnabled;
    private boolean fundingFrozen;
    private boolean withdrawalFrozen;
    private BigDecimal minUnit;
    private BigDecimal depositFee;
    private BigDecimal withdrawalFee;
    private BigDecimal interestIncrement;
    private BigDecimal minWithdrawal;
    private BigDecimal fundingMinSize;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isMarginEnabled() {
        return marginEnabled;
    }

    public void setMarginEnabled(boolean marginEnabled) {
        this.marginEnabled = marginEnabled;
    }

    public boolean isFundingFrozen() {
        return fundingFrozen;
    }

    public void setFundingFrozen(boolean fundingFrozen) {
        this.fundingFrozen = fundingFrozen;
    }

    public boolean isWithdrawalFrozen() {
        return withdrawalFrozen;
    }

    public void setWithdrawalFrozen(boolean withdrawalFrozen) {
        this.withdrawalFrozen = withdrawalFrozen;
    }

    public BigDecimal getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(BigDecimal minUnit) {
        this.minUnit = minUnit;
    }

    public BigDecimal getDepositFee() {
        return depositFee;
    }

    public void setDepositFee(BigDecimal depositFee) {
        this.depositFee = depositFee;
    }

    public BigDecimal getWithdrawalFee() {
        return withdrawalFee;
    }

    public void setWithdrawalFee(BigDecimal withdrawalFee) {
        this.withdrawalFee = withdrawalFee;
    }

    public BigDecimal getInterestIncrement() {
        return interestIncrement;
    }

    public void setInterestIncrement(BigDecimal interestIncrement) {
        this.interestIncrement = interestIncrement;
    }

    public BigDecimal getMinWithdrawal() {
        return minWithdrawal;
    }

    public void setMinWithdrawal(BigDecimal minWithdrawal) {
        this.minWithdrawal = minWithdrawal;
    }

    public BigDecimal getFundingMinSize() {
        return fundingMinSize;
    }

    public void setFundingMinSize(BigDecimal fundingMinSize) {
        this.fundingMinSize = fundingMinSize;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "ticker='" + ticker + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isActive=" + isActive +
                ", marginEnabled=" + marginEnabled +
                ", fundingFrozen=" + fundingFrozen +
                ", withdrawalFrozen=" + withdrawalFrozen +
                ", minUnit=" + minUnit +
                ", depositFee=" + depositFee +
                ", withdrawalFee=" + withdrawalFee +
                ", interestIncrement=" + interestIncrement +
                ", minWithdrawal=" + minWithdrawal +
                ", fundingMinSize=" + fundingMinSize +
                '}';
    }
}