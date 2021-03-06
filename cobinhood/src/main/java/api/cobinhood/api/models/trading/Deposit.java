package api.cobinhood.api.models.trading;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by joel on 3/24/18.
 */

public class Deposit {

    private BigDecimal amount;
    private Date completedAt;
    private Integer confirmations;
    private Date createdAt;
    private String currency;
    private String depositId;
    private BigDecimal fee;
    private String fromAddress;
    private Integer requiredConfirmations;
    private String status;
    private String txhash;
    private String userId;


    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public Integer getRequiredConfirmations() {
        return requiredConfirmations;
    }

    public void setRequiredConfirmations(Integer requiredConfirmations) {
        this.requiredConfirmations = requiredConfirmations;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=" + amount +
                ", completedAt=" + completedAt +
                ", confirmations=" + confirmations +
                ", createdAt=" + createdAt +
                ", currency='" + currency + '\'' +
                ", depositId='" + depositId + '\'' +
                ", fee=" + fee +
                ", fromAddress='" + fromAddress + '\'' +
                ", requiredConfirmations=" + requiredConfirmations +
                ", status='" + status + '\'' +
                ", txhash='" + txhash + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
