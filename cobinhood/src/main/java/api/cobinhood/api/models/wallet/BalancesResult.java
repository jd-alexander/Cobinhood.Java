package api.cobinhood.api.models.wallet;

import java.util.List;

/**
 * Created by joel on 3/23/18.
 */

public class BalancesResult {
    private List<BalanceItem> balances;

    public List<BalanceItem> getBalances() {
        return balances;
    }

    public void setBalances(List<BalanceItem> balances) {
        this.balances = balances;
    }
}
