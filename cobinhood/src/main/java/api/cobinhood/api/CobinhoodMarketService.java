package api.cobinhood.api;

import api.cobinhood.models.market.Currencies;
import api.cobinhood.models.market.OrderBook;
import api.cobinhood.models.market.TradingPairs;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static api.cobinhood.utils.Endpoints.GetAllCurrencies;
import static api.cobinhood.utils.Endpoints.GetAllTradingPairs;
import static api.cobinhood.utils.Endpoints.GetOrderBook;

/**
 * Created by joel on 3/19/18.
 */

public interface CobinhoodMarketService {
    @GET(GetAllCurrencies)
    Single<Currencies> getAllCurrencies();

    @GET(GetAllTradingPairs)
    Single<TradingPairs> getAllTradingPairs();

    @GET(GetOrderBook)
    Single<OrderBook> getOrderBook(@Path("trading_pair_id") String tradingPairId, @Query("limit") Integer limit);

}
