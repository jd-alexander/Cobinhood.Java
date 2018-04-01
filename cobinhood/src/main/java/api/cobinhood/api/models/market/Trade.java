package api.cobinhood.api.models.market;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by joel on 3/19/18.
 */

public class Trade {

    private String id;
    private BigDecimal price;
    private BigDecimal size;
    private String makerSide;
    private long timestamp;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getMakerSide() {
        return makerSide;
    }

    public void setMakerSide(String makerSide) {
        this.makerSide = makerSide;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", makerSide='" + makerSide + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
