package api.cobinhood.models.wallet;

import java.util.List;

/**
 * Created by joel on 3/23/18.
 */

public class LedgerResult {
    private List<LedgerItem> ledger;

    public List<LedgerItem> getLedger() {
        return ledger;
    }

    public void setLedger(List<LedgerItem> ledger) {
        this.ledger = ledger;
    }
}
