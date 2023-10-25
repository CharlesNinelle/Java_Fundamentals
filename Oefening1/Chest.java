package Oefening1;

public class Chest implements Lock{
    private boolean locked;

    @Override
    public void  lock(){
        if (!locked){
            locked=true;
            System.out.println("Chest is locked.");
        }else {
            System.out.println("Chest is already locked.");
        }
    }
    @Override
    public void unlock(){
        if (locked){
            locked=false;
            System.out.println("Chest is unlocked.");
        }else {
            System.out.println("Chest is already unlocked");
        }
    }
}
