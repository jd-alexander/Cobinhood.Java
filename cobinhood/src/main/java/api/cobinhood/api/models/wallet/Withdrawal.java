package api.cobinhood.api.models.wallet;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by joel on 3/24/18.
 */

public class Withdrawal {

    private BigDecimal amount;
    private Date completedAt;
    private Integer confirmations;
    private Date createdAt;
    private String currency;
    private BigDecimal fee;
    private Integer requiredConfirmations;
    private Date sentAt;
    private String status;
    private String toAddress;
    private String txhash;
    private Date updatedAt;
    private String userId;
    private String withdrawalId;



    public Date getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    public Integer getRequiredConfirmations() {
        return requiredConfirmations;
    }

    public void setRequiredConfirmations(Integer requiredConfirmations) {
        this.requiredConfirmations = requiredConfirmations;
    }

    public Date getSentAt() {
        return sentAt;
    }

    public void setSentAt(Date sentAt) {
        this.sentAt = sentAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWithdrawalId() {
        return withdrawalId;
    }

    public void setWithdrawalId(String withdrawalId) {
        this.withdrawalId = withdrawalId;
    }


    @Override
    public String toString() {
        return "Withdrawal{" +
                "amount=" + amount +
                ", completedAt=" + completedAt +
                ", confirmations=" + confirmations +
                ", createdAt=" + createdAt +
                ", currency='" + currency + '\'' +
                ", fee=" + fee +
                ", requiredConfirmations=" + requiredConfirmations +
                ", sentAt=" + sentAt +
                ", status='" + status + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", txhash='" + txhash + '\'' +
                ", updatedAt=" + updatedAt +
                ", userId='" + userId + '\'' +
                ", withdrawalId='" + withdrawalId + '\'' +
                '}';
    }
}
