package api.cobinhood.serializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

import api.cobinhood.api.models.trading.OrderType;

public class OrderTypeSerializer implements JsonDeserializer<OrderType>,JsonSerializer<OrderType> {
    @Override
    public OrderType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return OrderType.getByName(json.getAsJsonPrimitive().getAsString());
    }

    @Override
    public JsonElement serialize(OrderType src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.toString());
    }
}
