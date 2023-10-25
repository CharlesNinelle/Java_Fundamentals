package Oefening5;

public class Flashlight {
    private Battery battery;

    public Flashlight(Battery battery) {
        this.battery = battery;
    }

    public void turnOn() {
        int power = battery.deliverPower();
        System.out.println("Flashlight is ON with battery power " + power + " мАh.");
    }
}
