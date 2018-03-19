package api.cobinhood.api;

import api.cobinhood.models.market.Currencies;
import api.cobinhood.models.market.TradingPairs;
import io.reactivex.Single;
import retrofit2.http.GET;

import static api.cobinhood.utils.Endpoints.GetAllCurrencies;
import static api.cobinhood.utils.Endpoints.GetAllTradingPairs;

/**
 * Created by joel on 3/19/18.
 */

public interface CobinhoodMarketService {
    @GET(GetAllCurrencies)
    Single<Currencies> getAllCurrencies();

    @GET(GetAllTradingPairs)
    Single<TradingPairs> getAllTradingPairs();
}
