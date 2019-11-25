package resume;

public class MyThread extends Thread{
    boolean pause;
    Main m;
    MyThread(Main m){
        this.m = m;
        start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            synchronized (this){
                System.out.println("i="+i++);
                if(pause){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //m.msg("Resumed");
            }
        }
    }

    public void resumeThread(){
        pause = false;
        notify();
    }

    public void pause() {
        pause = true;
    }

}
