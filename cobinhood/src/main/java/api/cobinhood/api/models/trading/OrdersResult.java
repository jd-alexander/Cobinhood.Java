package api.cobinhood.api.models.trading;

import java.util.List;

/**
 * Created by joel on 3/21/18.
 */

public class OrdersResult {
    private List<OrderItem> orders;

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderItem> orders) {
        this.orders = orders;
    }
}