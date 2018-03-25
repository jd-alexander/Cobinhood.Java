package api.cobinhood.tests;

import org.junit.Before;
import org.junit.Test;

import api.cobinhood.CobinhoodApi;
import api.cobinhood.api.CobinhoodService;
import api.cobinhood.api.models.CobinResponse;
import api.cobinhood.api.models.market.CurrenciesResult;
import io.reactivex.observers.TestObserver;
import okhttp3.logging.HttpLoggingInterceptor;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by joel on 3/19/18.
 */

public class MarketTests {

    private CobinhoodService cobinhoodService;

    @Before
    public void setup()
    {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        cobinhoodService = new CobinhoodApi.Builder()
                .setLoggingInterceptor(logging)
                .build();

    }
    @Test
    public void CurrenciesTest()
    {
        TestObserver<CobinResponse<CurrenciesResult>> observer = cobinhoodService.getAllCurrencies().test();

        observer.assertNoErrors();

        CurrenciesResult value = observer.values().get(0).getResult();

        assertNotNull(value.getCurrencies());
        assertTrue(value.getCurrencies().size()>1);

    }
}
