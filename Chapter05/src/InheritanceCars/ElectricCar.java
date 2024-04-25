package InheritanceCars;

public class ElectricCar extends Car {
    private int battery;

    public ElectricCar(String color, int speed, int hp, int battery) {
        super(color, speed, hp);
        this.battery = battery;
    }

    public void charge(int amount) {
        battery += amount;
    }

    @Override
    public void accelerate(int amount) {
        speed += (amount + (battery / 100));
    }

    @Override
    public String toString() {
        return "ElectricCar: color=" + getColor() + ", speed=" + getSpeed() + " km/h, hp=" + getHp() + ", battery=" + battery + "%";
    }
}
