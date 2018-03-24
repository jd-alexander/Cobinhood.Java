package api.cobinhood.converters;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * Created by joel on 3/21/18.
 */
public class DateConverter extends Converter.Factory {
    @Override
    public Converter<?, String> stringConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Converter<?, String> converter = null;
        if (type instanceof Date) {
            converter = value -> String.valueOf(((Date)value).getTime()/1000);
        }
        return converter;
    }
}