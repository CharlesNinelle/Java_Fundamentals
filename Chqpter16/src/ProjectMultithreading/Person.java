package ProjectMultithreading;

import java.util.Random;

public class Person implements Runnable{
    private String name;
    private int age;
    private Thread heart;
    private Thread breathing;
    private Thread life;

    public Person(String name, int age, int heartBeatMiliSeconds) {
        this.name = name;
        this.age = age;
        this.heart = new Thread(new HeartBeat(heartBeatMiliSeconds));
        this.breathing = new Thread(new Lungs());
        this.life = new Thread(this);
        this.heart.start();
        this.breathing.start();
    }

    @Override
    public void run() {
        for (int i = age; i < 100; i++){
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Random random = new Random();
            int randomNumber = random.nextInt(20)+1;

            if (randomNumber == 13){
                endLife();
                break;
            }
        }
    }
    public void startLife(){
        life.start();
    }
    public void endLife(){
        life.interrupt();
    }
}
