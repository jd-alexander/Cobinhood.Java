package api.cobinhood.api.models.market;

import java.util.Date;

/**
 * Created by joel on 3/19/18.
 */

public class TradeItem {

    private String id;
    private String price;
    private String size;
    private String makerSide;
    private Date timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMakerSide() {
        return makerSide;
    }

    public void setMakerSide(String makerSide) {
        this.makerSide = makerSide;
    }

}
