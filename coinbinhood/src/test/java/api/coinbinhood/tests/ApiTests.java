package api.coinbinhood.tests;

import org.junit.Before;
import org.junit.Test;

import api.coinbinhood.CoinbinhoodApi;
import api.coinbinhood.CoinbinhoodService;
import api.coinbinhood.models.system.SystemTime;
import io.reactivex.observers.TestObserver;
import okhttp3.logging.HttpLoggingInterceptor;

import static org.junit.Assert.assertNotNull;

/**
 * Created by joel on 3/18/18.
 */

public class ApiTests {

    private CoinbinhoodService coinbinhoodService;

    @Before
    public void setup()
    {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        coinbinhoodService = new CoinbinhoodApi.Builder()
                .setLoggingInterceptor(logging)
                .build();

    }


    @Test
    public void SystemTime()
    {
        TestObserver<SystemTime> observer;
        observer = coinbinhoodService.getSystemTime().test();

        observer.assertNoErrors();

        SystemTime value = observer.values().get(0);

        assertNotNull(value.getResult().getTime());


    }
}
