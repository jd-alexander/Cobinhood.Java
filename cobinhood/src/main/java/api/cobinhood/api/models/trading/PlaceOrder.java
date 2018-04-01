package api.cobinhood.api.models.trading;

public class PlaceOrder {

    private String tradingPairId;
    private OrderType type;
    private double price;
    private double size;
    private Side side;


    public String getTradingPairId() {
        return tradingPairId;
    }

    public void setTradingPairId(String tradingPairId) {
        this.tradingPairId = tradingPairId;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }
}
