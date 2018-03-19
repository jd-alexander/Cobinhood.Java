package api.cobinhood.tests;

import org.junit.Before;
import org.junit.Test;

import api.cobinhood.CobinhoodApi;
import api.cobinhood.api.CobinhoodMarketService;
import api.cobinhood.models.market.Currencies;
import io.reactivex.observers.TestObserver;
import okhttp3.logging.HttpLoggingInterceptor;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by joel on 3/19/18.
 */

public class MarketTests {

    private CobinhoodMarketService cobinhoodService;

    @Before
    public void setup()
    {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        cobinhoodService = new CobinhoodApi.Builder()
                .setLoggingInterceptor(logging)
                .buildMarketService();

    }
    @Test
    public void CurrenciesTest()
    {
        TestObserver<Currencies> observer = cobinhoodService.getAllCurrencies().test();

        observer.assertNoErrors();

        Currencies value = observer.values().get(0);

        assertNotNull(value.getResult().getCurrencies());
        assertTrue(value.getResult().getCurrencies().size()>1);

    }
}
