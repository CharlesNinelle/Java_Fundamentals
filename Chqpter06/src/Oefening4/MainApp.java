package Oefening4;

public class MainApp {
    public static void main(String[] args) {
        //Upcasting
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Motorcycle();
        Vehicle vehicle3 = new Bicycle();

        vehicle1.start();
        vehicle2.start();
        vehicle3.start();

        //Douncasting
        if (vehicle1.getClass()==Car.class){
            Car car = (Car) vehicle1;
            car.drive();
        }
        if (vehicle2.getClass()== Motorcycle.class){
            Motorcycle motorcycle = (Motorcycle) vehicle2;
            motorcycle.ride();
        }
        if (vehicle3.getClass() == Bicycle.class){
            Bicycle bicycle = (Bicycle) vehicle3;
            bicycle.pedal();
        }

    }
}
