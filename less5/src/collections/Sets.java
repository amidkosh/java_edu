package collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> hash = new HashSet<String>();
        hash.add("");
        hash.add("fdg");
        hash.add("fdg");
        hash.add("fdgdsfg");
        hash.add("fdgdsfggdfghfg");
        hash.add("fdgdsfggdfghfg");
        hash.add("fdgdsfgggfdgfdfghfg");
        hash.add("fdgdsfgggfdgfgdfhgfghdfghfg");
        hash.add("fdgdsfhgfghghfgjfgdfghfg");
        for (String el: hash){
            System.out.println(el);
        }

        Set<String> tree = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;
                }
                if(o1.length() < o2.length()) {
                    return -1;
                }
                return 0;
            }
        });
        tree.add("fdg");
        tree.add("fdg");
        tree.add("fdgdsfg");
        tree.add("fdgdsfggdfghfg");
        tree.add("fdgdsfggdfghfg");
        tree.add("fdgdsfgggfdgfdfghfg");
        tree.add("fdgdsfgggfdgfgdfhgfghdfghfg");
        tree.add("fdgdsfhgfghghfgjfgdfghfg");
        System.out.println(tree);

    }
}
