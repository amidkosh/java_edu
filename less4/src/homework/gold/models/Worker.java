package homework.gold.models;

public class Worker extends Thread{
    private String name;
    private GoldMine mine;
    private int capacity = 3;
    private int gold;

    public Worker(String name, GoldMine mine) {
        this.name = name;
        this.mine = mine;
        start();
    }

    @Override
    public void run() {
        do{
            gold += mine.getGold(capacity);
            mine.msg("["+name+ "]: mined = "+ gold);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (
            mine.getGoldReserve()> 0
        );
    }

}
