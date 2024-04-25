package InheritanceDogs;

public class Pekingese extends HomelyDog {
    private double hairLength;

    public Pekingese(String name, int lifespan, char size, char fur) {
        super(name, lifespan, size,fur);
        this.hairLength = hairLength;
        System.out.println("Pekingese dogs have long hairs which makes them look so cool"+hairLength);
    }
    public void Play(){
        System.out.println("Pekingese can play");
    }
}
