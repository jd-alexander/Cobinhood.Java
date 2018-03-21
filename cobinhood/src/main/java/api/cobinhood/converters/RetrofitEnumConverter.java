package api.cobinhood.converters;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * Created by joel on 3/21/18.
 */

public class RetrofitEnumConverter extends Converter.Factory {
    @Override
    public Converter<?, String> stringConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Converter<?, String> converter = null;
        if (type instanceof Class && ((Class<?>)type).isEnum()) {
            converter = value -> ((Enum)value).name();
        }
        return converter;
    }
}
