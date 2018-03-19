package api.cobinhood.api;

import api.cobinhood.models.market.Currencies;
import api.cobinhood.models.market.OrderBook;
import api.cobinhood.models.market.TradingPairs;
import api.cobinhood.models.market.TradingStatistics;
import api.cobinhood.models.system.SystemInformation;
import api.cobinhood.models.system.SystemTime;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static api.cobinhood.utils.Endpoints.GetAllCurrencies;
import static api.cobinhood.utils.Endpoints.GetAllTradingPairs;
import static api.cobinhood.utils.Endpoints.GetOrderBook;
import static api.cobinhood.utils.Endpoints.GetSystemInformation;
import static api.cobinhood.utils.Endpoints.GetSystemTime;
import static api.cobinhood.utils.Endpoints.GetTradingStatistics;

/**
 * Created by joel on 3/17/18.
 *
 * This interface contains all the methods that will be available within
 * this api.
 */

public interface CobinhoodService {

    @GET(GetSystemTime)
    Single<SystemTime> getSystemTime();

    @GET(GetSystemInformation)
    Single<SystemInformation> getSystemInformation();

    @GET(GetAllCurrencies)
    Single<Currencies> getAllCurrencies();

    @GET(GetAllTradingPairs)
    Single<TradingPairs> getAllTradingPairs();

    @GET(GetOrderBook)
    Single<OrderBook> getOrderBook(@Path("trading_pair_id") String tradingPairId, @Query("limit") Integer limit);

    @GET(GetTradingStatistics)
    Single<TradingStatistics> getTradingStatistics();

}
