package streamAPI;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");

        stream.forEach(System.out::println);
        System.out.println("---------------");
        List<String> list = new ArrayList<String>(Arrays.asList("d", "f", "g", "a"));
        list.add("r");

        stream = list.stream();
        stream.distinct()
                .forEach(System.out::println);
        System.out.println("---------------");
        Long l = list.stream().count();
        System.out.println(l);

        System.out.println("---------------");
        list = list.stream()
                .filter(s-> s.contains("d"))
                .collect(Collectors.toList());
        System.out.println(list);

        System.out.println("---------------");
        Map<String, Integer> nums = new HashMap<String, Integer>();

        nums.put("One", 1);
        nums.put("Two", 2);
        nums.put("Three", 3);
        List<Number> numList = nums.entrySet()
                .stream()
                .map(e -> new Number().str(e.getKey()).integer(e.getValue()))
//                .filter(number -> number.getInteger()>=2)
                .collect(Collectors.toList());

        System.out.println(numList);
        System.out.println("---------------");

        Optional<Number> number = numList.stream().findAny();
        System.out.println(number.get());

        number.ifPresent(n -> System.out.println(n));
        System.out.println("---------------");

        List<Description> d = new ArrayList<Description>();
        d.add(new Description(Arrays.asList("de1","de1","de2")));
        d.add(new Description(Arrays.asList("en1","en1","en2")));
        d.add(new Description(Arrays.asList("fr1","fr1","fr2")));

        List<String> strings = d.stream().
                flatMap(descr -> descr.getDescr().stream())
                .collect(Collectors.toList());
        System.out.println(strings);
    }
}
