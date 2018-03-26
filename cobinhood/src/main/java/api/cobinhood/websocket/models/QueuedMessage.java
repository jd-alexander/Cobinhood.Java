package api.cobinhood.websocket.models;

/**
 * Created by joel on 3/26/18.
 */

public class QueuedMessage<T> implements Event {
    private final T message;

    public QueuedMessage(T message) {
        this.message = message;
    }


    public T message() {
        return message;
    }

}
