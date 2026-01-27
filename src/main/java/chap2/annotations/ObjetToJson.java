package chap2.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ObjetToJson {
    private static void checkIfSerializable(Object object) {
        if (object == null) {
            throw new RuntimeException("object null ne peut pas être sérializé");
        }
        //reflection java
        Class<?> c = object.getClass();
        if (!c.isAnnotationPresent(JsonSerializable.class)) {
            throw new RuntimeException("object non serializable");
        }
    }

    private static void initializeObject(Object object) throws InvocationTargetException, IllegalAccessException {
        //reflection java
        Class<?> c = object.getClass();
        for (Method m : c.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Init.class)) {
                m.setAccessible(true);
                m.invoke(object);
            }
        }
    }

    private static String getJsonString(Object object) throws IllegalAccessException {
        //reflection java
        Class<?> c = object.getClass();
        Map<String, String> jsonElementsMap = new HashMap<>();
        for (Field field : c.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                JsonElement annotation = field.getAnnotation(JsonElement.class);
                String key = annotation.key().isEmpty() ? field.getName() : annotation.key();
                jsonElementsMap.put(key, (String) field.get(object));
            }
        }
        String jsonString = jsonElementsMap
                .entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(", "));
        return "{" + jsonString + " }";
    }

    public static String convertToJson(Object object) throws InvocationTargetException, IllegalAccessException {
        checkIfSerializable(object);
        initializeObject(object);
        return getJsonString(object);
    }
}
