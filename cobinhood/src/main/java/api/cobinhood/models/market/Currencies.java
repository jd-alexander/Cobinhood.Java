package api.cobinhood.models.market;

import api.cobinhood.models.BaseModel;

/**
 * Created by joel on 3/18/18.
 */

public class Currencies extends BaseModel{
    private CurrenciesResult result;

    public CurrenciesResult getResult() {
        return result;
    }

    public void setResult(CurrenciesResult result) {
        this.result = result;
    }
}
