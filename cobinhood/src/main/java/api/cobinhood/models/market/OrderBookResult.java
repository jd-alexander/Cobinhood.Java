package api.cobinhood.models.market;

/**
 * Created by joel on 3/19/18.
 */

public class OrderBookResult {
    private OrderBookItem orderBook;

    public OrderBookItem getOrderBook() {
        return orderBook;
    }

    public void setOrderBook(OrderBookItem orderBook) {
        this.orderBook = orderBook;
    }
}
