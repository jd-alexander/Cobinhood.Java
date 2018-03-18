package api.coinbinhood;

import api.coinbinhood.errorhandling.RxErrorHandlingCallAdapterFactory;
import api.coinbinhood.interceptors.AuthenticationInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

import static api.coinbinhood.utils.Util.isEmpty;


public class CoinbinhoodApi {

    private  CoinbinhoodService coinbinhoodService;

    public static final String COINBINHOOD_WEB_API_ENDPOINT = "https://api.cobinhood.com";
    public static final String COINBINHOOD_WEBSOCKET_ENDPOINT = "wss://feed.cobinhood.com/ws";

    public CoinbinhoodApi() {

    }

    public CoinbinhoodService getCoinbinhoodService() {
        return coinbinhoodService;
    }

    /**
     * This builder is utilized for setting up all the configurations that
     * will be needed to create an instance of the Coinbinhood API
     */
    public static class Builder
    {
        private String accessToken;
        private Interceptor loggingInterceptor;

        public Interceptor getLoggingInterceptor() {
            return loggingInterceptor;
        }

        public Builder setLoggingInterceptor(Interceptor loggingInterceptor) {
            this.loggingInterceptor = loggingInterceptor;

            return this;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public Builder setAccessToken(String accessToken) {
            this.accessToken = accessToken;

            return this;
        }

        public CoinbinhoodService build()
        {

            OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();

            if (loggingInterceptor!=null) {
                okHttpBuilder.addInterceptor(loggingInterceptor);
            }

            if(!isEmpty(accessToken)){
                okHttpBuilder.addInterceptor(new AuthenticationInterceptor(accessToken));
            }

            OkHttpClient okHttpClient = okHttpBuilder.build();

            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .addCallAdapterFactory(RxErrorHandlingCallAdapterFactory.create())
                    .baseUrl(COINBINHOOD_WEB_API_ENDPOINT)
                    .build();

            return retrofit.create(CoinbinhoodService.class);
        }
    }

}
