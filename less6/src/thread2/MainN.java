package thread2;

public class MainN {
    public static void main(String[] args) {
//        Thread th = new Thread(new MyThread());
//        th.start();
//        new MyThread();
        System.out.println(Thread.activeCount());
        Thread t = new Thread(() -> System.out.println("hell"));
        t.start();

        System.out.println(Thread.activeCount());
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("NEW THREAD");
            }
        };
        new Thread(runnable).start();
        new Thread(()-> System.out.println("NEW STRING")).start();
        System.out.println(Thread.activeCount());
    }
}
