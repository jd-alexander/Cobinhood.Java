package api.cobinhood.tests;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import api.cobinhood.CobinhoodApi;
import api.cobinhood.api.CobinhoodService;
import api.cobinhood.api.models.MapResponse;
import api.cobinhood.api.models.Response;
import api.cobinhood.api.models.chart.Candle;
import api.cobinhood.api.models.chart.Timeframe;
import api.cobinhood.api.models.market.Currency;
import api.cobinhood.api.models.market.OrderBook;
import api.cobinhood.api.models.market.Ticker;
import api.cobinhood.api.models.market.Trade;
import api.cobinhood.api.models.market.TradingPair;
import api.cobinhood.api.models.market.TradingStatistics;
import io.reactivex.observers.TestObserver;
import okhttp3.logging.HttpLoggingInterceptor;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by joel on 3/19/18.
 */

public class MarketTests extends BaseTest {

    private CobinhoodService cobinhoodService;

    @Before
    public void setup() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        cobinhoodService = new CobinhoodApi.Builder()
                .setLoggingInterceptor(logging)
                .build();

    }

    @Test
    public void CurrenciesTest() {
        TestObserver<Response<List<Currency>>> observer = cobinhoodService.getAllCurrencies().test();

        observer.assertNoErrors();

        List<Currency> value = observer.values().get(0).getResult();

        AssertList(value);

    }

    @Test
    public void TradingPairsTest() {
        TestObserver<Response<List<TradingPair>>> observer = cobinhoodService.getAllTradingPairs().test();

        observer.assertNoErrors();

        List<TradingPair> result = observer.values().get(0).getResult();

        AssertList(result);

    }

    @Test
    public void OrderBookTest() {
        TestObserver<Response<OrderBook>> observer = cobinhoodService.getOrderBook("BOT-BTC", 10).test();

        observer.assertNoErrors();

        OrderBook result = observer.values().get(0).getResult();

        assertNotNull(result);
        assertNotNull(result.getBids());
        assertNotNull(result.getBids().get(0).getPrice());
        System.out.print(result.getBids().get(0).toString());

    }

    @Test
    public void TradingStatisticsTest() {
        TestObserver<MapResponse<Map<String, TradingStatistics>>> observer = cobinhoodService.getTradingStatistics().test();

        observer.assertNoErrors();

        Map<String, TradingStatistics> result = observer.values().get(0).getResult();

        assertNotNull(result);

        assertTrue(result.size() > 1);

        System.out.print(result.entrySet().iterator().next().getValue().toString());

    }

    @Test
    public void TickerTest() {
        TestObserver<Response<Ticker>> observer = cobinhoodService.getTicker("BOT-BTC").test();

        observer.assertNoErrors();

        Ticker result = observer.values().get(0).getResult();

        Assert(result);

    }

    @Test
    public void RecentTradesTest() {
        TestObserver<Response<List<Trade>>> observer = cobinhoodService.getRecentTrades("BOT-BTC", 10).test();

        observer.assertNoErrors();

        List<Trade> result = observer.values().get(0).getResult();

        AssertList(result);
    }

    @Test
    public void CandlesTest() {
        TestObserver<Response<List<Candle>>> observer = cobinhoodService.getCandles("BOT-BTC", Timeframe.TIMEFRAME_1_DAY,null,null).test();

        observer.assertNoErrors();

        List<Candle> result = observer.values().get(0).getResult();

        AssertList(result);
    }

}
