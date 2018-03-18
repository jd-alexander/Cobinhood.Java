package api.coinbinhood;

import api.coinbinhood.models.market.Currencies;
import api.coinbinhood.models.system.SystemInformation;
import api.coinbinhood.models.system.SystemTime;
import io.reactivex.Single;
import retrofit2.http.GET;

import static api.coinbinhood.utils.Endpoints.GetAllCurrencies;
import static api.coinbinhood.utils.Endpoints.GetSystemInformation;
import static api.coinbinhood.utils.Endpoints.GetSystemTime;

/**
 * Created by joel on 3/17/18.
 *
 * This interface contains all the methods that will be available within
 * this api.
 */

public interface CoinbinhoodService {

    @GET(GetSystemTime)
    Single<SystemTime> getSystemTime();

    @GET(GetSystemInformation)
    Single<SystemInformation> getSystemInformation();

    @GET(GetAllCurrencies)
    Single<Currencies> getAllCurrencies();
}
