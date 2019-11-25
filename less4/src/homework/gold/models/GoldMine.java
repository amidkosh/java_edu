package homework.gold.models;

import java.util.concurrent.atomic.AtomicInteger;

public class GoldMine {
    private volatile AtomicInteger reserve = new AtomicInteger(1000);

    public GoldMine(){

    }

    public int getGold(int mining){
        reserve.addAndGet(-mining);
        return reserve.get() > 0 ? mining: 0;
    }
    public int getGoldReserve() {
        return reserve.get();
    }
    public synchronized void msg(String str){
        System.out.println(str);
    }
}
