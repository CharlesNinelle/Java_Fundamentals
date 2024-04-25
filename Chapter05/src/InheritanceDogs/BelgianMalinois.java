package InheritanceDogs;

public class BelgianMalinois extends WildDog {
    private boolean dangerous;
    private double maxRunningSpeed;

    public BelgianMalinois(String name, int lifespan, char size, boolean dangerous, double maxRunningSpeed){
        super(name, lifespan, size);
    }
    public void protect(){
        System.out.println("Belgian Malinois can protecting");
    }
    public void attack(){
        System.out.println("Belgian Malinois can attack");
    }

}
