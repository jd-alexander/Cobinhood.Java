package api.cobinhood.websocket;


import com.jakewharton.rxrelay2.PublishRelay;

import api.cobinhood.websocket.models.Event;
import api.cobinhood.websocket.models.Open;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/**
 * Created by joel on 3/25/18.
 */

public class CobinhoodSocket {

    private WebSocket webSocket;
    private Request request;

    private PublishRelay<Event> eventStream = PublishRelay.create();
    private boolean userRequestedClose;

    private void doConnect() {

        if (webSocket != null) {
            if (eventStream.hasObservers()) {
                eventStream.accept(new Open());
            }
            return;
        }

        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        okHttpClient.newWebSocket(request, webSocketListener());
    }

    private void doDisconnect(int code, String reason) {
        userRequestedClose = true;
        if (webSocket != null) {
            webSocket.close(code, reason);
        }
    }



    private WebSocketListener webSocketListener(){
        return new WebSocketListener() {
            @Override
            public void onOpen(WebSocket webSocket, Response response) {
                super.onOpen(webSocket, response);
            }

            @Override
            public void onMessage(WebSocket webSocket, String text) {
                super.onMessage(webSocket, text);
            }

            @Override
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                super.onMessage(webSocket, bytes);
            }

            @Override
            public void onClosing(WebSocket webSocket, int code, String reason) {
                super.onClosing(webSocket, code, reason);
            }

            @Override
            public void onClosed(WebSocket webSocket, int code, String reason) {
                super.onClosed(webSocket, code, reason);
            }

            @Override
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                super.onFailure(webSocket, t, response);
            }
        };
    }
}
