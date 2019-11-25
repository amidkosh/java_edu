package collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
//        Map<String, Integer> hash = new HashMap<String, Integer>();
//        Map<String, Integer> hash = new LinkedHashMap<String, Integer>();
        Map<String, Integer> hash = new TreeMap<String, Integer>();
//        hash.put(null, null);
        hash.put("one", 1);
        hash.put("two", 2);
        hash.put("three", 30);
        hash.put("three", 3);
hash.putIfAbsent("one", 1);
hash.putIfAbsent("four", 4);
hash.putIfAbsent("four", 5);
hash.putIfAbsent("six", 5);
        Set<String> keys = hash.keySet();
        Collection<Integer> values = hash.values();
        for (String key : hash.keySet()) {
            System.out.println(key + " : " + hash.get(key));
        }

        System.out.println(hash);
        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        };

        System.out.println(hash.getOrDefault("four", 43));
        System.out.println(hash.getOrDefault("seven", 7575));


    }
}
