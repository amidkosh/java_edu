package thread_man;

import thread_man.models.Man;
import thread_man.models.Mann;

public class Game<T extends  Mann> {
    public static void main(String[] args) {
//        System.out.println("Start");
//        System.out.println("Start");
//        Man m1 = new Man("bla");
//        Man m2 = new Man("ola");
//        if(!m1.isAlive()){
//            System.out.println("bla won!");
//        }
//        if(!m2.isAlive()){
//            System.out.println("ola won!");
//        }
        Mann a = new Mann("A");
        Mann b = new Mann("B");
        while(a.isAlive() && b.isAlive()){
        }
        System.out.println("Winner is " + (a.isAlive() ? b.getManName(): a.getManName()));
    }

}
