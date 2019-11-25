package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MsgPrinter {
    public String msg;

    public void printMsg(FuncInt inter){
        System.out.println(inter.getMsg(msg));
    }

    public static void main(String[] args) {
//        MsgPrinter p = new MsgPrinter();
//        p.msg = "Message";
//        FuncInt inter = s -> s + "blalbas";
//        p.printMsg(s -> s+ " changed");


        List<String> list = new ArrayList<String>(Arrays.asList("434324", "3465", "788"));
        Comparator<String> c = (o1,o2)-> {
            if(o1.length() > o2.length()){
                return 1;
            }
            if(o1.length() < o2.length()){
                return -1;
            }
            return 0;
        };
//        list.sort(c);
        list.sort(Comparator.comparing(String::length));
        System.out.println(list);
        System.out.println("Fuck!");

        Function<String, Integer> f = s -> Integer.parseInt(s);
    }
}
