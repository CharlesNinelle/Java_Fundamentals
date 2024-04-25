package InheritanceCars;

public class Cabriolet extends Car {
    private boolean sunroof;

    public Cabriolet(String color, int speed, int hp, boolean sunroof) {
        super(color, speed, hp);
        this.sunroof = sunroof;
    }

    public boolean getSunroof() {
        return sunroof;
    }

    public void openRoof() {
        sunroof = true;
    }

    @Override
    public String toString() {
        return "Cabriolet: color=" + getColor() + ", speed=" + getSpeed() + " km/h, hp=" + getHp() + ", sunroof=" + sunroof;
    }
}
