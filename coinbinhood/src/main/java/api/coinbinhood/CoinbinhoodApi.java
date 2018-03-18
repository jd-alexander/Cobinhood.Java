package api.coinbinhood;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CoinbinhoodApi {

    private boolean useCredentials;
    private String accessToken;
    private  CoinbinhoodService coinbinhoodService;
    private boolean debugMode;

    public static final String COINBINHOOD_WEB_API_ENDPOINT = "https://api.cobinhood.com";
    public static final String COINBINHOOD_WEBSOCKET_ENDPOINT = "wss://feed.cobinhood.com/ws";

    public CoinbinhoodApi() {

    }

    private void init()
    {

    }


    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    private boolean useCredentials() {
        return useCredentials;
    }

    private void setUseCredentials(boolean useCredentials) {
        this.useCredentials = useCredentials;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }
}
