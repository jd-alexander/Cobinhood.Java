package api.cobinhood.api;

import java.util.Date;
import java.util.List;
import java.util.Map;

import api.cobinhood.api.models.Response;
import api.cobinhood.api.models.MapResponse;
import api.cobinhood.api.models.chart.Candle;
import api.cobinhood.api.models.chart.Timeframe;
import api.cobinhood.api.models.market.Currency;
import api.cobinhood.api.models.market.OrderBook;
import api.cobinhood.api.models.market.Ticker;
import api.cobinhood.api.models.market.Trade;
import api.cobinhood.api.models.market.TradingPair;
import api.cobinhood.api.models.market.TradingStatistics;
import api.cobinhood.api.models.system.SystemInformation;
import api.cobinhood.api.models.trading.Deposit;
import api.cobinhood.api.models.trading.Order;
import api.cobinhood.api.models.wallet.Balance;
import api.cobinhood.api.models.wallet.DepositAddress;
import api.cobinhood.api.models.wallet.Ledger;
import api.cobinhood.api.models.wallet.Withdrawal;
import api.cobinhood.api.models.wallet.WithdrawalAddress;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static api.cobinhood.utils.Endpoints.CancelOrder;
import static api.cobinhood.utils.Endpoints.GetAllCurrencies;
import static api.cobinhood.utils.Endpoints.GetAllDeposits;
import static api.cobinhood.utils.Endpoints.GetAllOrders;
import static api.cobinhood.utils.Endpoints.GetAllTradingPairs;
import static api.cobinhood.utils.Endpoints.GetAllWithdrawals;
import static api.cobinhood.utils.Endpoints.GetCandles;
import static api.cobinhood.utils.Endpoints.GetDeposit;
import static api.cobinhood.utils.Endpoints.GetDepositAddresses;
import static api.cobinhood.utils.Endpoints.GetLedgerEntries;
import static api.cobinhood.utils.Endpoints.GetOrder;
import static api.cobinhood.utils.Endpoints.GetOrderBook;
import static api.cobinhood.utils.Endpoints.GetOrderHistory;
import static api.cobinhood.utils.Endpoints.GetOrderTrades;
import static api.cobinhood.utils.Endpoints.GetRecentTrades;
import static api.cobinhood.utils.Endpoints.GetSystemInformation;
import static api.cobinhood.utils.Endpoints.GetSystemTime;
import static api.cobinhood.utils.Endpoints.GetTicker;
import static api.cobinhood.utils.Endpoints.GetTrade;
import static api.cobinhood.utils.Endpoints.GetTradeHistory;
import static api.cobinhood.utils.Endpoints.GetTradingStatistics;
import static api.cobinhood.utils.Endpoints.GetWalletBalances;
import static api.cobinhood.utils.Endpoints.GetWithdrawal;
import static api.cobinhood.utils.Endpoints.GetWithdrawalAddresses;
import static api.cobinhood.utils.Endpoints.ModifyOrder;
import static api.cobinhood.utils.Endpoints.PlaceOrder;

/**
 * Created by joel on 3/19/18.
 */

public interface CobinhoodService {

    //System API calls

    @GET(GetSystemTime)
    Single<Response<Date>> getSystemTime();

    @GET(GetSystemInformation)
    Single<Response<SystemInformation>> getSystemInformation();

    //Market API calls

    @GET(GetAllCurrencies)
    Single<Response<List<Currency>>> getAllCurrencies();

    @GET(GetAllTradingPairs)
    Single<Response<List<TradingPair>>> getAllTradingPairs();

    @GET(GetOrderBook)
    Single<Response<OrderBook>> getOrderBook(@Path("trading_pair_id") String tradingPairId, @Query("limit") Integer limit);

    @GET(GetTradingStatistics)
    Single<MapResponse<Map<String,TradingStatistics>>> getTradingStatistics();

    @GET(GetTicker)
    Single<Response<Ticker>> getTicker(@Path("trading_pair_id") String tradingPairId);

    @GET(GetRecentTrades)
    Single<Response<List<Trade>>> getRecentTrades(@Path("trading_pair_id") String tradingPairId, @Query("limit") Integer limit);

    @GET(GetCandles)
    Single<Response<List<Candle>>> getCandles(@Path("trading_pair_id") String tradingPairId, @Query("timeframe") Timeframe timeframe, @Query("start_time") Date startTime, @Query("end_time") Date endTime);

    //Trading API calls

    @GET(GetOrder)
    Single<Response<Order>> getOrder(@Path("order_id") String orderId);

    @GET(GetOrderTrades)
    Single<Response<List<Trade>>> getOrderTrades(@Path("order_id") String orderId);

    @GET(GetAllOrders)
    Single<Response<List<Order>>> getOrders(@Query("page") Integer page, @Query("limit") Integer limit);

    @POST(PlaceOrder)
    Single<Response<Order>> placeOrder(@Body Order order);

    @DELETE(CancelOrder)
    Single<Response> cancelOrder(@Path("order_id") String orderId);

    @GET(GetOrderHistory)
    Single<Response<List<Order>>> getOrderHistory(@Query("page") Integer page, @Query("limit") Integer limit);

    @GET(GetTrade)
    Single<Response<Trade>> getTrade(@Path("trade_id") String tradeId);

    @PUT(ModifyOrder)
    Single<Response> modifyOrder(@Body Order order, @Path("order_id") String orderId);

    @GET(GetTradeHistory)
    Single<Response<List<Trade>>> getTradeHistory(@Query("page") Integer page, @Query("limit") Integer limit);

    //wallet API calls

    @GET(GetWalletBalances)
    Single<Response<List<Balance>>> getWalletBalances();

    @GET(GetLedgerEntries)
    Single<Response<List<Ledger>>> getLedgerEntries(@Query("page") Integer page, @Query("limit") Integer limit);

    @GET(GetDepositAddresses)
    Single<Response<List<DepositAddress>>> getDepositAddresses(@Query("currency") String currency);

    @GET(GetWithdrawalAddresses)
    Single<Response<List<WithdrawalAddress>>> getWithdrawalAddresses(@Query("currency") String currency);

    @GET(GetWithdrawal)
    Single<Response<Withdrawal>> getWithdrawal(@Path("withdrawal_id") String withdrawalId);

    @GET(GetAllWithdrawals)
    Single<Response<List<Withdrawal>>> getWithdrawals(@Query("page") Integer page, @Query("limit") Integer limit);

    @GET(GetDeposit)
    Single<Response<Deposit>> getDeposit(@Path("deposit_id") String depositId);

    @GET(GetAllDeposits)
    Single<Response<List<Deposit>>> getDeposits();

}