package Oefening2;

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
        System.out.println();
        System.out.println("**********************");
        System.out.println();
        myCar.toggleSwith();//Turn off the engine
        myCar.gas();//No acceleration (engine off)
        System.out.println();
        System.out.println("**********************");
        System.out.println();
    }
}
