package thread_man.models;

public class Man extends Thread{
    public String name;
    Integer currPos = 0;

    public Man(String name) {
        this.name = name;
        start();
    }

    private Integer makeStep(Integer currentPlace){
        double d = (Math.random()*3)+1;
        Integer delta = (int) d;
        return currentPlace + delta;
    }

    @Override
    public void run() {
        do {
            currPos = makeStep(currPos);

            String s="";
            for (Integer i=0; i<currPos; i++) {
                s += "_";
            }
            System.out.println(name + ": "+ s);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (
                currPos<20
        );
    }
}
