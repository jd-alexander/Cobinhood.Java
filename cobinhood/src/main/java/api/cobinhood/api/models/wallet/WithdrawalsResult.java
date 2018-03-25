package api.cobinhood.api.models.wallet;

import java.util.List;

/**
 * Created by joel on 3/24/18.
 */

public class WithdrawalsResult {
    private List<WithdrawalItem> withdrawals;

    public List<WithdrawalItem> getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(List<WithdrawalItem> withdrawals) {
        this.withdrawals = withdrawals;
    }
}
