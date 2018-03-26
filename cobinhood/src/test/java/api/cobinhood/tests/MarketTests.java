package api.cobinhood.tests;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import api.cobinhood.CobinhoodApi;
import api.cobinhood.api.CobinhoodService;
import api.cobinhood.api.models.MapResponse;
import api.cobinhood.api.models.Response;
import api.cobinhood.api.models.market.Currency;
import api.cobinhood.api.models.market.OrderBook;
import api.cobinhood.api.models.market.TradingPair;
import api.cobinhood.api.models.market.TradingStatistics;
import io.reactivex.observers.TestObserver;
import okhttp3.logging.HttpLoggingInterceptor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by joel on 3/19/18.
 */

public class MarketTests {

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

        assertNotNull(value);

        assertTrue(value.size() > 1);

        System.out.print(value.get(0).toString());

        value.stream().forEach(currency -> {

            for (Field f : currency.getClass().getDeclaredFields()) {

                try {
                    f.setAccessible(true);

                    if (f.get(currency) != null)
                        assertTrue(String.format("The property %s of Currency at index %2d isn't null.", f.getName(), value.indexOf(currency)), true);
                    else
                        fail(String.format("The property %s of Currency at index %2d is null.", f.getName(), value.indexOf(currency)));

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        });
    }

    @Test
    public void TradingPairsTest()
    {
        TestObserver<Response<List<TradingPair>>> observer = cobinhoodService.getAllTradingPairs().test();

        observer.assertNoErrors();

        List<TradingPair> result = observer.values().get(0).getResult();

        assertNotNull(result);

        assertTrue(result.size() > 1);


    }

    @Test
    public void OrderBookTest()
    {
        TestObserver<Response<OrderBook>> observer = cobinhoodService.getOrderBook("BOT-BTC",10).test();

        observer.assertNoErrors();

        OrderBook result = observer.values().get(0).getResult();

        assertNotNull(result);
        assertNotNull(result.getBids());
        assertNotNull(result.getBids().get(0).getPrice());
        System.out.print(result.getBids().get(0).toString());

    }

    @Test
    public void TradingStatisticsTest()
    {
        TestObserver<MapResponse<Map<String,TradingStatistics>>> observer = cobinhoodService.getTradingStatistics().test();

        observer.assertNoErrors();

        Map<String,TradingStatistics> result = observer.values().get(0).getResult();

        assertNotNull(result);

        assertTrue(result.size() > 1);
        System.out.print(result.entrySet().iterator().next().getValue().toString());

    }


}
