package thread;

public class MultiThread {
    public static void main(String[] args) {
        System.out.println("Start");

//        MyThread myThread =
                new MyThread();
//        Thread thread = new Thread(myThread);
//        thread.start();
//        myThread.start();

        System.out.println("End");
        System.out.println(Thread.activeCount());
    }
}
