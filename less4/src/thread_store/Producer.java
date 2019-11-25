package thread_store;

public class Producer extends Thread {
    private final Warehause w;
    Producer(Warehause w) {
        this.w = w;
        start();

    }

    @Override
    public void run() {
        while (true){
            int b = (int) (Math.random()*Integer.MAX_VALUE);
            w.put(b);
            w.putMsg("Producer put "+b+" items");

        }
    }
}
