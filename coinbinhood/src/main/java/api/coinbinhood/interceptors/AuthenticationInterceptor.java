package api.coinbinhood.interceptors;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by joel on 3/17/18.
 */

public class AuthenticationInterceptor implements Interceptor {
    private String token;

    public AuthenticationInterceptor(String token) {
        this.token = token;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        Request authenticatedRequest = request.newBuilder()
                .header("authorization", token).build();

        return chain.proceed(authenticatedRequest);
    }
}
