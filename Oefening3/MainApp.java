package Oefening3;

public class MainApp {
    public static void main(String[] args) {
        Car myCar = new Car() {
            @Override
            public void toggleSwitch() {
            }
        };
        System.out.println();
        System.out.println("**********************");
        System.out.println();
        myCar.toggleSwith();//Engine ON
        myCar.gas();// Acceleration (engine is on)
        myCar.openDoor(2); // Door №2 is open
        myCar.toggleSwith(); // Cannot accelerate (at least one door is open)
        System.out.println();
        System.out.println("**********************");
        System.out.println();
        myCar.toggleSwith();//Turn off the engine
        myCar.gas();//No acceleration (engine off)
        myCar.closeDoor(2); // Close door №2
        myCar.gas(); // Accelerate (all door is closed)
        myCar.toggleSwitch(); // turn off the engine
        System.out.println();
        System.out.println("**********************");
        System.out.println();
    }
}
