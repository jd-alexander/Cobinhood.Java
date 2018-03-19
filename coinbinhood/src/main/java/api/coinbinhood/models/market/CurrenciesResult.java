package api.coinbinhood.models.market;

import java.util.List;

/**
 * Created by joel on 3/18/18.
 */

public class CurrenciesResult {
    private List<Currency> currencies;

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }
}
