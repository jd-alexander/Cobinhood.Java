package api.cobinhood.websocket.models;

/**
 * Created by joel on 3/26/18.
 */

public class Closed extends Throwable implements Event {
    public static final int INTERNAL_ERROR = 500;
    private final String reason;
    private final int code;

    public Closed(int code, String reason) {
        this.code = code;
        this.reason = reason;
    }

    public int code() {
        return code;
    }

    public String reason() {
        return reason;
    }

    @Override
    public String getMessage() {
        return reason();
    }
}
