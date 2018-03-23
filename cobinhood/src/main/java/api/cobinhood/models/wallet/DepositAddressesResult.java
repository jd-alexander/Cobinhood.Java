package api.cobinhood.models.wallet;

import java.util.List;

/**
 * Created by joel on 3/23/18.
 */

public class DepositAddressesResult {

    List<DepositAddressItem> depositAddresses;

    public List<DepositAddressItem> getDepositAddresses() {
        return depositAddresses;
    }

    public void setDepositAddresses(List<DepositAddressItem> depositAddresses) {
        this.depositAddresses = depositAddresses;
    }
}
