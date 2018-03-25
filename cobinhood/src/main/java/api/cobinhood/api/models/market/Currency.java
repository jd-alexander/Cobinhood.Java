package api.cobinhood.api.models.market;

import com.google.gson.annotations.SerializedName;

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
    private double minUnit;
    private double depositFee;
    private double withdrawalFee;
    private double interestIncrement;
    private double minWithdrawal;
    private double fundingMinSize;

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

    public double getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(double minUnit) {
        this.minUnit = minUnit;
    }

    public double getDepositFee() {
        return depositFee;
    }

    public void setDepositFee(double depositFee) {
        this.depositFee = depositFee;
    }

    public double getWithdrawalFee() {
        return withdrawalFee;
    }

    public void setWithdrawalFee(double withdrawalFee) {
        this.withdrawalFee = withdrawalFee;
    }

    public double getInterestIncrement() {
        return interestIncrement;
    }

    public void setInterestIncrement(double interestIncrement) {
        this.interestIncrement = interestIncrement;
    }

    public double getMinWithdrawal() {
        return minWithdrawal;
    }

    public void setMinWithdrawal(double minWithdrawal) {
        this.minWithdrawal = minWithdrawal;
    }

    public double getFundingMinSize() {
        return fundingMinSize;
    }

    public void setFundingMinSize(double fundingMinSize) {
        this.fundingMinSize = fundingMinSize;
    }
}