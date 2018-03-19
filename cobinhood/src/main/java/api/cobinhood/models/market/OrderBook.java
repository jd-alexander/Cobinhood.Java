package api.cobinhood.models.market;

import api.cobinhood.models.BaseModel;

/**
 * Created by joel on 3/19/18.
 */

public class OrderBook extends BaseModel {
    private OrderBookResult result;

    public OrderBookResult getResult() {
        return result;
    }

    public void setResult(OrderBookResult result) {
        this.result = result;
    }
}
