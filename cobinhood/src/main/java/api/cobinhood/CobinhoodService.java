package api.cobinhood;

import api.cobinhood.models.market.Currencies;
import api.cobinhood.models.system.SystemInformation;
import api.cobinhood.models.system.SystemTime;
import io.reactivex.Single;
import retrofit2.http.GET;

import static api.cobinhood.utils.Endpoints.GetAllCurrencies;
import static api.cobinhood.utils.Endpoints.GetSystemInformation;
import static api.cobinhood.utils.Endpoints.GetSystemTime;

/**
 * Created by joel on 3/17/18.
 *
 * This interface contains all the methods that will be available within
 * this api.
 */

public interface CobinhoodService {

    @GET(GetSystemTime)
    Single<SystemTime> getSystemTime();

    @GET(GetSystemInformation)
    Single<SystemInformation> getSystemInformation();

    @GET(GetAllCurrencies)
    Single<Currencies> getAllCurrencies();
}
