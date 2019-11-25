package collections;

import java.util.*;
import java.util.function.Consumer;

public class CustomLists {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<String>();

        linked.add("hefdgsfgfggfgfshfhfad");
        linked.add("heafdgsdd1");
        linked.add("head2");
        linked.add("hgfdgdfhsfhead3");


String sec = linked.get(3);
        System.out.println(sec);


        boolean c = linked.contains("head");
        Iterator<String> it = linked.iterator();
//        it.next();
//        it.hasNext();
//        it.remove();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
            if(next.contains("2")){
                it.remove();
            }
        }

        for(String element: linked){
            System.out.println(element);
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add("first");
        arrayList.contains("first");
        arrayList.get(0);

//        arrayList.add(4,"fgfgh");

        List<String> array = new ArrayList<String>(linked);
        array.addAll(array);
        array.addAll(3, Arrays.asList("one", "two"));
        System.out.println(array.toString());

        Comparator<String> comparator = new Comparator<String>() {
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
        };

        array.sort(comparator);
        System.out.println(array.toString());
    }
}
