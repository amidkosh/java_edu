package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JsonWriter {
    public static boolean isSerializable(Object obj) {
        boolean serializable = false;
        Class<? extends Object> clazz = obj.getClass();
        return clazz.getAnnotation(jsonSerializable.class) != null;
    }

    public static String getJson(Object obj) throws IllegalAccessException {
        Class<? extends Object> clazz = obj.getClass();
        Map<String, Object> map = new HashMap<String, Object>();
        for (Field field : clazz.getDeclaredFields()) {
            jsonElement elAnn = field.getAnnotation(jsonElement.class);
            if (elAnn != null) {
                field.setAccessible(true);
                map.put(elAnn.key().isEmpty() ? field.getName() : elAnn.key(), field.get(obj));
            }
        }
        String json = map.entrySet().stream()
                .map(e -> "\"" + e.getKey() + "\" : \"" + e.getValue() + "\"")
                .collect(Collectors.joining(","));

        return "{"+ json +"}";
    }

    public static void methodInvocation(Object obj) throws InvocationTargetException, IllegalAccessException {
        Class<? extends Object> clazz = obj.getClass();
        for(Method method: clazz.getDeclaredMethods()){
            if(method.getAnnotation(MethodInv.class) != null){
                method.setAccessible(true);
                method.invoke(obj);
            }
        }
    }


    public static void main(String[] args) throws IllegalAccessException {
        Dog dog = new Dog(3, "Jessy");

        String json = "";
        if(isSerializable(dog)) {
            json = getJson(dog);
        }
        System.out.println(json);
        try {
            methodInvocation(dog);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
