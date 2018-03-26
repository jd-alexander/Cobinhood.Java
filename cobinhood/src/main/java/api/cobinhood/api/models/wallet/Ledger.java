package api.cobinhood.api.models.wallet;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by joel on 3/23/18.
 */

public class Ledger {
    private Date timestamp;
    private String currency;
    private String type;
    private String action;
    private BigDecimal amount;
    private BigDecimal balance;
    private String tradeId;
    private String depositId;
    private String withdrawalId;
    private String fiatDepositId;
    private String fiatWithdrawalId;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public String getWithdrawalId() {
        return withdrawalId;
    }

    public void setWithdrawalId(String withdrawalId) {
        this.withdrawalId = withdrawalId;
    }

    public String getFiatDepositId() {
        return fiatDepositId;
    }

    public void setFiatDepositId(String fiatDepositId) {
        this.fiatDepositId = fiatDepositId;
    }

    public String getFiatWithdrawalId() {
        return fiatWithdrawalId;
    }

    public void setFiatWithdrawalId(String fiatWithdrawalId) {
        this.fiatWithdrawalId = fiatWithdrawalId;
    }

    @Override
    public String toString() {
        return "Ledger{" +
                "timestamp=" + timestamp +
                ", currency='" + currency + '\'' +
                ", type='" + type + '\'' +
                ", action='" + action + '\'' +
                ", amount=" + amount +
                ", balance=" + balance +
                ", tradeId='" + tradeId + '\'' +
                ", depositId='" + depositId + '\'' +
                ", withdrawalId='" + withdrawalId + '\'' +
                ", fiatDepositId='" + fiatDepositId + '\'' +
                ", fiatWithdrawalId='" + fiatWithdrawalId + '\'' +
                '}';
    }
}
