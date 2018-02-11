package ru.home.strategy;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

/**
 * Strategy for mapping model fields names to JSON response fields names
 */
public class PostNameStrategy extends PropertyNamingStrategy {

    @Override
    public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
        return convert(defaultName);
    }

    @Override
    public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return convert(defaultName);
    }

    @Override
    public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
        return convert(defaultName);
    }

    public String convert(String defaultName)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < defaultName.length(); i++) {
            if (Character.isUpperCase(defaultName.charAt(i))) {
                char lower = Character.toLowerCase(defaultName.charAt(i));
                stringBuilder.append("_");
                stringBuilder.append(lower);
            } else {
                stringBuilder.append(defaultName.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
