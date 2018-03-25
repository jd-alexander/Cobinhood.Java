package api.cobinhood.serializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import api.cobinhood.api.models.market.OfferItem;

/**
 * Created by joel on 3/24/18.
 */

public class OfferDeserializer implements JsonDeserializer<List<OfferItem>> {
    @Override
    public List<OfferItem> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        List<OfferItem> list = new ArrayList<>();
        for (JsonElement item : json.getAsJsonArray()) {

            list.add(new OfferItem(item.getAsJsonArray().get(0).getAsString(),item.getAsJsonArray().get(1).getAsString(),item.getAsJsonArray().get(2).getAsString()));
        }

        return list;
    }
}
