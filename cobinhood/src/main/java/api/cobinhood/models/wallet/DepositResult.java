package api.cobinhood.models.wallet;

import api.cobinhood.models.trading.DepositItem;

/**
 * Created by joel on 3/24/18.
 */

public class DepositResult {
    private DepositItem deposit;

    public DepositItem getDeposit() {
        return deposit;
    }

    public void setDeposit(DepositItem deposit) {
        this.deposit = deposit;
    }
}
