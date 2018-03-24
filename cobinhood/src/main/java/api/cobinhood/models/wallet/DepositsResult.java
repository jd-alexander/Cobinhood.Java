package api.cobinhood.models.wallet;

import java.util.List;

import api.cobinhood.models.trading.DepositItem;

/**
 * Created by joel on 3/24/18.
 */

public class DepositsResult {
    private List<DepositItem> deposits;

    public List<DepositItem> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<DepositItem> deposits) {
        this.deposits = deposits;
    }
}
