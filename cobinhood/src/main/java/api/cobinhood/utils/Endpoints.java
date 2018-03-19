package api.cobinhood.utils;

/**
 * Created by joel on 3/18/18.
 */

public class Endpoints {

    public static final String GetSystemTime = "system/time";
    public static final String GetSystemInformation = "system/info";

    public static final String GetAllCurrencies = "market/currencies";
    public static final String GetAllTradingPairs = "market/trading_pairs";
    public static final String GetTradingStatistics = "market/stats";
    public static final String GetOrderBook = "market/orderbooks/<trading_pair_id>";
    public static final String GetTicker = "market/tickers/<trading_pair_id>";
    public static final String GetRecentTrades = "market/trades/<trading_pair_id>";


    public static final String GetCandles = "chart/candles/<trading_pair_id>";

    public static final String GetOrder = "trading/orders/<order_id>";
    public static final String GetOrderTrades = "trading/orders/<order_id>/trades";
    public static final String GetAllOrders = "trading/orders";
    public static final String PlaceOrder = "trading/orders";
    public static final String ModifyOrder = "trading/orders/<order_id>";
    public static final String CancelOrder = "trading/orders/<order_id>";
    public static final String GetOrderHistory = "trading/order_history";
    public static final String GetTrade = "trading/trades/<trade_id>";
    public static final String GetTradeHistory = "trading/trades";

    public static final String GetWalletBalances = "wallet/balances";
    public static final String GetLedgerEntries = "wallet/ledger";
    public static final String GetDepositAddresses = "wallet/deposit_addresses";
    public static final String GetWithdrawalAddresses = "wallet/withdrawal_addresses";
    public static final String GetWithdrawal = "wallet/withdrawals/<withdrawal_id>";
    public static final String GetAllWithdrawals = "wallet/withdrawals";
    public static final String GetDeposit = "wallet/deposits/<deposit_id>";
    public static final String GetAllDeposits = "wallet/deposits";
}
    

