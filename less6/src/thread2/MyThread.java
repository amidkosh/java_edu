package thread2;

public class MyThread implements Runnable{
    Thread thread;

    MyThread() {
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
