package resume;

public class Main {
    Main(){}
    public static void main(String[] args) throws InterruptedException {
        Main m = new Main();
        MyThread t = new MyThread(m);
        t.pause();
        Thread.sleep(3000);

        t.resumeThread();

        Thread.sleep(2000);

    }
    public void msg(String msg) {
        System.out.println(msg);
    }
}
