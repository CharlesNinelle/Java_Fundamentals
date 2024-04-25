package ProjectMultithreading;

public class Lungs implements Runnable {
    private  boolean lungsFull = false;
    public Lungs(){
    }

    @Override
    public void run() {
        while (true){
            if(lungsFull){
                System.out.println("Breath out");
            }else {
                System.out.println("Breath in");
            }
            lungsFull = !lungsFull;
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                return;
            }
        }
    }
}
