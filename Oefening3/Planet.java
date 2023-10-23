package Oefening3;

public class Planet {
    private final String name;
    private final double radius;

    public Planet(String name, double radius){
        this.name=name;
        this.radius=radius;
    }
    public final double calculaterCircumference(){
        return 2*Math.PI*radius;
    }
    public String getName(){
        return name;
    }
}
