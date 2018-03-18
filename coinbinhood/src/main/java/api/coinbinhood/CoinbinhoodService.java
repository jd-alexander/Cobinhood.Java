package api.coinbinhood;

import api.coinbinhood.models.system.SystemTime;
import io.reactivex.Single;
import retrofit2.http.GET;

import static api.coinbinhood.utils.Endpoints.GetSystemTime;

/**
 * Created by joel on 3/17/18.
 */

public interface CoinbinhoodService {

    @GET(GetSystemTime)
    Single<SystemTime> getSystemTime();

}
