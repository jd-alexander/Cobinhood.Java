package api.cobinhood.api.models.trading;

import java.util.List;

/**
 * Created by joel on 3/21/18.
 */

public class OrderHistoryResult {
    private List<OrderItem> orderHistory;

    public List<OrderItem> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<OrderItem> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
