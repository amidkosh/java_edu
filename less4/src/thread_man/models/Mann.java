package thread_man.models;

public class Mann extends Thread {
    public String name;

    public Mann(String name){
        this.name =name;
        start();
    }
    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        do{
            int stepCnt = (int) (Math.random()*3);
            for (int i = 0; i<stepCnt;i++){
                sb.append("_");
            }
            System.out.println(name+": "+sb.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (sb.length() < 20);
    }


    public String getManName() {
        return name;
    }
}
