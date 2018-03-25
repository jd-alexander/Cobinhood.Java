package api.cobinhood.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by joel on 3/25/18.
 */

public class CobinResult<T> {

    @SerializedName(value="value", alternate={"currencies","trading_pairs","time", "orderbook", "ticker", "trades", "candles",
            "orders", "order", "order_history", "balances", "ledger", "deposit_addresses", "withdrawal_addresses","info",
            "withdrawal", "withdrawals", "deposit", "deposits"})
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
