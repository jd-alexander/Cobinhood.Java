package api.cobinhood.tests;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import api.cobinhood.CobinhoodApi;
import api.cobinhood.api.CobinhoodService;
import api.cobinhood.api.models.CobinResponse;
import api.cobinhood.api.models.market.Currency;
import api.cobinhood.utils.BuildConfig;
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
        TestObserver<CobinResponse<List<Currency>>> observer = cobinhoodService.getAllCurrencies().test();

        observer.assertNoErrors();

        List<Currency> value = observer.values().get(0).getResult();

        assertNotNull(value);
        assertTrue(value.size()>1);

    }
}
