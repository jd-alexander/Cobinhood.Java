package api.cobinhood.tests;

import org.junit.Before;
import org.junit.Test;

import api.cobinhood.CobinhoodApi;
import api.cobinhood.api.CobinhoodService;
import api.cobinhood.models.system.SystemInformation;
import api.cobinhood.models.system.SystemTime;
import io.reactivex.observers.TestObserver;
import okhttp3.logging.HttpLoggingInterceptor;

import static org.junit.Assert.assertNotNull;

/**
 * Created by joel on 3/18/18.
 */

public class SystemTests {

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
    public void SystemTimeTest()
    {
        TestObserver<SystemTime> observer = cobinhoodService.getSystemTime().test();

        observer.assertNoErrors();

        SystemTime value = observer.values().get(0);

        assertNotNull(value.getResult().getTime());
    }

    @Test
    public void SystemInformationTest()
    {
        TestObserver<SystemInformation> observer = cobinhoodService.getSystemInformation().test();

        observer.assertNoErrors();

        SystemInformation value = observer.values().get(0);

        assertNotNull(value.getResult().getInfo());

    }


}
