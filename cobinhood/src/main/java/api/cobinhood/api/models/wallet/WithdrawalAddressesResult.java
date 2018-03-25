package api.cobinhood.api.models.wallet;

import java.util.List;

/**
 * Created by joel on 3/23/18.
 */

public class WithdrawalAddressesResult {
    private List<WithdrawalAddressItem> withdrawalAddresses;

    public List<WithdrawalAddressItem> getWithdrawalAddresses() {
        return withdrawalAddresses;
    }

    public void setWithdrawalAddresses(List<WithdrawalAddressItem> withdrawalAddresses) {
        this.withdrawalAddresses = withdrawalAddresses;
    }
}
