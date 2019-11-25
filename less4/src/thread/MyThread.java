package thread;

public class MyThread extends Thread{

    MyThread() {
        start();
    }

    @Override
    public void run() {
//        super.run();
        System.out.println("Hello from another thread!");
    }
}
