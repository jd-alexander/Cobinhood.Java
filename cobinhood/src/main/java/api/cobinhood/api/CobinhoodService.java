package api.cobinhood.api;

import java.util.Date;
import java.util.List;

import api.cobinhood.api.models.CobinResponse;
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

    //Market API calls

    @GET(GetSystemTime)
    Single<CobinResponse<Date>> getSystemTime();

    @GET(GetSystemInformation)
    Single<CobinResponse<SystemInformation>> getSystemInformation();

    @GET(GetAllCurrencies)
    Single<CobinResponse<List<Currency>>> getAllCurrencies();

    @GET(GetAllTradingPairs)
    Single<CobinResponse<List<TradingPair>>> getAllTradingPairs();

    @GET(GetOrderBook)
    Single<CobinResponse<OrderBook>> getOrderBook(@Path("trading_pair_id") String tradingPairId, @Query("limit") Integer limit);

    @GET(GetTradingStatistics)
    Single<CobinResponse<List<TradingStatistics>>> getTradingStatistics();

    @GET(GetTicker)
    Single<CobinResponse<Ticker>> getTicker(@Path("trading_pair_id") String tradingPairId);

    @GET(GetRecentTrades)
    Single<CobinResponse<List<Trade>>> getRecentTrades(@Path("trading_pair_id") String tradingPairId, @Query("limit") Integer limit);

    @GET(GetCandles)
    Single<CobinResponse<List<Candle>>> getCandles(@Path("trading_pair_id") String tradingPairId, @Path("timeframe")Timeframe timeframe, @Path("start_time") long startTime, @Path("end_time")long endTime);

    //Trading API calls

    @GET(GetOrder)
    Single<CobinResponse<Order>> getOrder(@Path("order_id") String orderId);

    @GET(GetOrderTrades)
    Single<CobinResponse<List<Trade>>> getOrderTrades(@Path("order_id") String orderId);

    @GET(GetAllOrders)
    Single<CobinResponse<List<Order>>> getOrders(@Query("page") Integer page, @Query("limit") Integer limit);

    @POST(PlaceOrder)
    Single<CobinResponse<Order>> placeOrder(@Body Order order);

    @DELETE(CancelOrder)
    Single<CobinResponse> cancelOrder(@Path("order_id") String orderId);

    @GET(GetOrderHistory)
    Single<CobinResponse<List<Order>>> getOrderHistory(@Query("page") Integer page, @Query("limit") Integer limit);

    @GET(GetTrade)
    Single<CobinResponse<Trade>> getTrade(@Path("trade_id") String tradeId);

    @PUT(ModifyOrder)
    Single<CobinResponse> modifyOrder(@Body Order order, @Path("order_id") String orderId);

    @GET(GetTradeHistory)
    Single<CobinResponse<List<Trade>>> getTradeHistory(@Query("page") Integer page, @Query("limit") Integer limit);

    //wallet API calls

    @GET(GetWalletBalances)
    Single<CobinResponse<List<Balance>>> getWalletBalances();

    @GET(GetLedgerEntries)
    Single<CobinResponse<List<Ledger>>> getLedgerEntries(@Query("page") Integer page, @Query("limit") Integer limit);

    @GET(GetDepositAddresses)
    Single<CobinResponse<List<DepositAddress>>> getDepositAddresses(@Query("currency") String currency);

    @GET(GetWithdrawalAddresses)
    Single<CobinResponse<List<WithdrawalAddress>>> getWithdrawalAddresses(@Query("currency") String currency);

    @GET(GetWithdrawal)
    Single<CobinResponse<Withdrawal>> getWithdrawal(@Path("withdrawal_id") String withdrawalId);

    @GET(GetAllWithdrawals)
    Single<CobinResponse<List<Withdrawal>>> getWithdrawals(@Query("page") Integer page, @Query("limit") Integer limit);

    @GET(GetDeposit)
    Single<CobinResponse<Deposit>> getDeposit(@Path("deposit_id") String depositId);

    @GET(GetAllDeposits)
    Single<CobinResponse<List<Deposit>>> getDeposits();

}