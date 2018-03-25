package api.cobinhood.api.models.chart;

/**
 * Created by joel on 3/21/18.
 */

public enum Timeframe {

    TIMEFRAME_1_MINUTE("1m"),
    TIMEFRAME_5_MINUTES("5m"),
    TIMEFRAME_15_MINUTES("15m"),
    TIMEFRAME_30_MINUTES("30m"),
    TIMEFRAME_1_HOUR("1h"),
    TIMEFRAME_3_HOURS("3h"),
    TIMEFRAME_6_HOURS("6h"),
    TIMEFRAME_12_HOUR("12h"),
    TIMEFRAME_1_DAY("1D"),
    TIMEFRAME_7_DAYS("7D"),
    TIMEFRAME_14_DAYS("14D"),
    TIMEFRAME_1_MONTH("1M");

    private final String name;

    private Timeframe(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

}
