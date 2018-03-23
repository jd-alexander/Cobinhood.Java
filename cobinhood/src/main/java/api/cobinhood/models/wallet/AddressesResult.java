package api.cobinhood.models.wallet;

import java.util.List;

/**
 * Created by joel on 3/23/18.
 */

public class AddressesResult {

    List<AddressItem> depositAddresses;

    public List<AddressItem> getDepositAddresses() {
        return depositAddresses;
    }

    public void setDepositAddresses(List<AddressItem> depositAddresses) {
        this.depositAddresses = depositAddresses;
    }
}
