package api.cobinhood.api.models.trading;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by joel on 3/21/18.
 */

public class Order {

    private String id;
    private String tradingPairId;
    private String side;
    private String type;
    private BigDecimal price;
    private BigDecimal size;
    private BigDecimal filled;
    private String state;
    private long timestamp;
    private BigDecimal eqPrice;
    private Date completedAt;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTradingPairId() {
        return tradingPairId;
    }

    public void setTradingPairId(String tradingPairId) {
        this.tradingPairId = tradingPairId;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public BigDecimal getFilled() {
        return filled;
    }

    public void setFilled(BigDecimal filled) {
        this.filled = filled;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getEqPrice() {
        return eqPrice;
    }

    public void setEqPrice(BigDecimal eqPrice) {
        this.eqPrice = eqPrice;
    }

    public Date getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", tradingPairId='" + tradingPairId + '\'' +
                ", side='" + side + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", filled=" + filled +
                ", state='" + state + '\'' +
                ", timestamp=" + timestamp +
                ", eqPrice=" + eqPrice +
                ", completedAt=" + completedAt +
                '}';
    }
}