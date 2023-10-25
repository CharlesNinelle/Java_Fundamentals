package Oefening1;

public class MainAppLock {
    public static void main(String[] args) {
        Lock chest = new Chest();

        chest.lock();//Close the chest
        chest.unlock();//Open the chest
        chest.unlock();//The chest already open
        chest.lock();//The chest already closed
    }
}
