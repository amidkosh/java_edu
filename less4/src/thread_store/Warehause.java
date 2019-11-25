package thread_store;

public class Warehause {

    private int buffer;

    private volatile boolean empty;

    Warehause(){
    }
    public static void main(String[] args) throws InterruptedException {

        Warehause w = new Warehause();
        Consumer con = new Consumer(w);
        Producer prod = new Producer(w);


    }

    public synchronized int get() {
        if(empty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int b = buffer;
        buffer = 0;
        empty = true;
        notify();
        return b;
    }

    public synchronized void put(int buffer) {
        if(!empty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        this.buffer = buffer;
        notify();
    }
    public synchronized void putMsg(String msg){
        System.out.println(msg);
    }


}
