package homework.gold.models;

import java.util.LinkedList;

public class Barrak extends Thread{
    private GoldMine mine;

    public Barrak(GoldMine mine){
        this.mine = mine;
        new Worker("1", mine);
        new Worker("2", mine);
        new Worker("3", mine);
        new Worker("4",mine);
        start();
        LinkedList n = new LinkedList();
    }

    @Override
    public void run() {
        int i = 4;
        do{
            new Worker(Integer.toString(Thread.activeCount()), mine);
            mine.msg("Gold mine Reserve: "+ mine.getGoldReserve());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (
            mine.getGoldReserve() > 0
        );
    }
}
