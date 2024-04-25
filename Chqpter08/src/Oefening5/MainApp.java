package Oefening5;

public class MainApp {
    public static void main(String[] args) {
        System.out.println();

        Battery battery1 = new DuracellAA();
        int power1 = battery1.deliverPower();
        System.out.println("Duracell AA with power " + power1 + " mAh.");

        Battery battery2 = new DuracellAAA();
        int power2 = battery2.deliverPower();
        System.out.println("Duracell AAA with power " + power2 + " mAh.");

        Battery battery3 = new VartaAA();
        int power3 = battery3.deliverPower();
        System.out.println("Varta AA with power " + power3 + " mAh.");

        System.out.println();

        // Create instances of flashlights with different batteries
        Flashlight flashlight1 = new Flashlight(battery1);
        Flashlight flashlight2 = new Flashlight(battery2);
        Flashlight flashlight3 = new Flashlight(battery3);

        // Turn on the flashlights
        flashlight1.turnOn();
        flashlight2.turnOn();
        flashlight3.turnOn();

    }
}
