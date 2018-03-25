package api.cobinhood.interceptors;

import java.io.IOException;

import api.cobinhood.utils.NonceManager;
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

        if(request.method() != "GET")
        {
            Request nonceRequest = authenticatedRequest.newBuilder()
                    .header("nonce", String.valueOf(NonceManager.getInstance().getNonce())).build();

            return chain.proceed(nonceRequest);

        }


        return chain.proceed(authenticatedRequest);
    }
}
