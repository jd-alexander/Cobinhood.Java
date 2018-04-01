package api.cobinhood.api.models.trading;

public enum  OrderType {

    Market("market"),
    Limit("limit"),
    Stop("stop"),
    StopLimit("stop_limit");

    private final String name;

    private OrderType(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

    public static OrderType getByName(String name) {

        for(OrderType value:OrderType.values())
        {
            if(value.name.equals(name))
                return value;
        }

        return null;
    }
}
