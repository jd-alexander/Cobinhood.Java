package api.cobinhood.api.models.market;

/**
 * Created by joel on 3/19/18.
 */

public class Offer {
    private String price;
    private String count;
    private String size;

    public Offer(String price, String count, String size) {
        this.price = price;
        this.count = count;
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}