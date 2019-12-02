package preparation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Functionals {

    public static Integer toInt(Function<String, Integer> f, String s){
        return f.apply(s);
    }
    public static Integer toInt(BiFunction<String,Boolean, Integer> f, String s, Boolean b){
        return f.apply(s, b);
    }
    public static void strout(Consumer<String> cons, String s){
        cons.accept(s);
    }
    public static void strout(BiConsumer<String, Integer> bicons, String s, Integer i){
        bicons.accept(s,i);
    }

    public static void main(String[] args) {
        Function<String, Integer> func = (s)-> Integer.parseInt(s);

        int i = toInt(func, "123");
        System.out.println(i);

        BiFunction<String, Boolean, Integer> bifn = (s,b) -> b? Integer.parseInt(s) : -1;
        int k = toInt(bifn, "6786",false);
        System.out.println(k);

        Consumer<String> cons = (s)-> System.out.println(s.toUpperCase());

        strout(cons, "Some text");

        BiConsumer<String, Integer> bicons = (s,b)-> System.out.println(s + " : " + b);
        strout(bicons, "String", 456);

        Map<String, Integer> salaries = new HashMap<String, Integer>();
        salaries.put("Name1", 1000);
        salaries.put("Name2", 2000);
        salaries.put("Name3", 3000);
        salaries.forEach((name, salary) -> {
            salaries.put(name, salary + 1000);
        });

        System.out.println(salaries);

        Supplier<Double> rnd = () -> Math.random();
        System.out.println(rnd.get());

        Predicate<String> pred = (s) -> s.contains("A");
        System.out.println(pred.test("fbshGBV"));
    }
}
