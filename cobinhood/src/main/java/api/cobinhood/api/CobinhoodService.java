package api.cobinhood.api;

import api.cobinhood.models.CobinResponse;
import api.cobinhood.models.chart.CandleResult;
import api.cobinhood.models.market.CurrenciesResult;
import api.cobinhood.models.market.OrderBookResult;
import api.cobinhood.models.market.TickerResult;
import api.cobinhood.models.market.TradesResult;
import api.cobinhood.models.market.TradingPairsResult;
import api.cobinhood.models.market.TradingStatisticsResult;
import api.cobinhood.models.system.SystemInformationResult;
import api.cobinhood.models.system.SystemTimeResult;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static api.cobinhood.utils.Endpoints.*;

/**
 * Created by joel on 3/19/18.
 */

public interface CobinhoodService {

    @GET(GetSystemTime)
    Single<CobinResponse<SystemTimeResult>> getSystemTime();

    @GET(GetSystemInformation)
    Single<CobinResponse<SystemInformationResult>> getSystemInformation();

    @GET(GetAllCurrencies)
    Single<CobinResponse<CurrenciesResult>> getAllCurrencies();

    @GET(GetAllTradingPairs)
    Single<CobinResponse<TradingPairsResult>> getAllTradingPairs();

    @GET(GetOrderBook)
    Single<CobinResponse<OrderBookResult>> getOrderBook(@Path("trading_pair_id") String tradingPairId, @Query("limit") Integer limit);

    @GET(GetTradingStatistics)
    Single<CobinResponse<TradingStatisticsResult>> getTradingStatistics();

    @GET(GetTicker)
    Single<CobinResponse<TickerResult>> getTicker(@Path("trading_pair_id") String tradingPairId);

    @GET(GetRecentTrades)
    Single<CobinResponse<TradesResult>> getRecentTrades(@Path("trading_pair_id") String tradingPairId, @Query("limit") Integer limit);

    @GET(GetCandles)
    Single<CobinResponse<CandleResult>> getCandles(@Path("trading_pair_id") String tradingPairId);

}