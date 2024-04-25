package Oefening3;

public class Planet {
    //Final variables for the planet's name and radius
    private final String NAME;
    private final double RADIUS;

    //Constructor for the planet class that takes name and radius of the planet
    public Planet(String name, double radius){
        this.NAME=name;
        this.RADIUS=radius;
    }

    //Final method to calculate the circumference of the planet
    public final double calculaterCircumference(){
        return 2*Math.PI*RADIUS;
    }

    //Getter- to retrieve the planet's name
    public String getName(){
        return NAME;
    }
}
