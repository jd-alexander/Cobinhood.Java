package api.cobinhood.serializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

import api.cobinhood.api.models.chart.Timeframe;

/**
 * Created by joel on 3/26/18.
 */

public class TimeframeDeserializer implements JsonDeserializer<Timeframe> {
    @Override
    public Timeframe deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return Timeframe.getByName(json.getAsJsonPrimitive().getAsString());
    }
}
