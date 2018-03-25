package api.cobinhood.api.models.trading;

/**
 * Created by joel on 3/21/18.
 */

public class OrderResult {
    private OrderItem order;

    public OrderItem getOrder() {
        return order;
    }

    public void setOrder(OrderItem order) {
        this.order = order;
    }
}
