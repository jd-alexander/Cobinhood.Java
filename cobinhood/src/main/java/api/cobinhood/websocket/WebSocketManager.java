package api.cobinhood.websocket;

import okhttp3.WebSocket;
import okio.ByteString;

/**
 * Created by joel on 3/24/18.
 */

public interface WebSocketManager {

    interface IWsManager {

        WebSocket getWebSocket();

        void startConnect();

        void stopConnect();

        boolean isWsConnected();

        int getCurrentStatus();

        void setCurrentStatus(int currentStatus);

        boolean sendMessage(String msg);

        boolean sendMessage(ByteString byteString);
    }
}
