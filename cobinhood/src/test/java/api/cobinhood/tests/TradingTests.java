package api.cobinhood.tests;

import com.sun.corba.se.spi.transport.TransportDefault;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import api.cobinhood.CobinhoodApi;
import api.cobinhood.api.CobinhoodService;
import api.cobinhood.api.models.Response;
import api.cobinhood.api.models.market.Trade;
import api.cobinhood.api.models.trading.Order;
import api.cobinhood.utils.BuildConfig;
import io.reactivex.observers.TestObserver;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by joel on 3/26/18.
 */

public class TradingTests extends BaseTest {

    private CobinhoodService cobinhoodService;

    @Before
    public void setup()
    {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        cobinhoodService = new CobinhoodApi.Builder()
                .setLoggingInterceptor(logging)
                .setAccessToken(BuildConfig.API_KEY)
                .build();

    }

    @Test
    public void GetOrderTest()
    {
        TestObserver<Response<Order>> observer = cobinhoodService.getOrder("0941ef71-effa-425c-a390-0dc837117aca").test();

        observer.assertNoErrors();

        Order result = observer.values().get(0).getResult();

        Assert(result);

    }

    @Test
    public void OrderTradeTests()
    {
        TestObserver<Response<List<Trade>>> observer = cobinhoodService.getOrderTrades("07797042-7f4b-4d09-8c25-e55fa2f80add").test();

        observer.assertNoErrors();

        List<Trade> result = observer.values().get(0).getResult();

        AssertList(result);

    }

    @Test
    public void GetOrdersTest()
    {
        TestObserver<Response<List<Order>>> observer = cobinhoodService.getOrders(1,10).test();

        observer.assertNoErrors();

        List<Order> result = observer.values().get(0).getResult();

        AssertList(result);

    }




}
