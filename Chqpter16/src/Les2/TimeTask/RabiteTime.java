package Les2.TimeTask;

import java.util.Timer;
import java.util.TimerTask;

public class RabiteTime extends TimerTask {
    @Override
    public void run(){
        System.out.println("I'm late, I'm late, for a very important date!");
    }

    public static void main(String[] args) {
        RabiteTime task = new RabiteTime();
        Timer timer = new Timer(true);
        timer.schedule(task, 5000);
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        //timer.cancel();
    }
}
