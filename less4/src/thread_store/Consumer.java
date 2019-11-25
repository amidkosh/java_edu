package thread_store;

public class Consumer extends Thread {
    private final Warehause w;
    Consumer(Warehause w){
        this.w = w;
        start();

    }

    @Override
    public void run() {
        while (true) {
                w.putMsg("Consumer got " + w.get() + " items");
        }

    }
}
