package api.cobinhood.tests;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import api.cobinhood.CobinhoodApi;
import api.cobinhood.api.CobinhoodService;
import api.cobinhood.api.models.CobinResponse;
import api.cobinhood.api.models.system.SystemInformation;
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
        TestObserver<CobinResponse<Date>> observer = cobinhoodService.getSystemTime().test();

        observer.assertNoErrors();

        Date value = observer.values().get(0).getResult();

        assertNotNull(value.getTime());
    }

    @Test
    public void SystemInformationTest()
    {
        TestObserver<CobinResponse<SystemInformation>> observer = cobinhoodService.getSystemInformation().test();

        observer.assertNoErrors();

        SystemInformation value = observer.values().get(0).getResult();

        assertNotNull(value);

    }


}
