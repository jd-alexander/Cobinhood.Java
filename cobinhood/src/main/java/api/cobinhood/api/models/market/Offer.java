package api.cobinhood.api.models.market;

import java.math.BigDecimal;

/**
 * Created by joel on 3/19/18.
 */

public class Offer {
    private BigDecimal price;
    private int count;
    private BigDecimal size;

    public Offer(String price, String count, String size) {
        this.price = new BigDecimal(price);
        this.count = Integer.parseInt(count);
        this.size = new BigDecimal(size);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "price=" + price +
                ", count=" + count +
                ", size=" + size +
                '}';
    }
}