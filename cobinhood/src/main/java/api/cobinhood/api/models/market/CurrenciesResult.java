package api.cobinhood.api.models.market;

import java.util.List;

/**
 * Created by joel on 3/18/18.
 */

public class CurrenciesResult {
    private List<CurrencyItem> currencies;

    public List<CurrencyItem> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<CurrencyItem> currencies) {
        this.currencies = currencies;
    }
}
