package InheritanceCars;

public class Main {
    public static void main(String[] args) {
        Car redSUV = new SUV("Red", 0, 250, true, true);
        Cabriolet yellowCabriolet = new Cabriolet("Yellow", 0, 200, true);
        ElectricCar greenElectricCar = new ElectricCar("Green", 0, 0, 60);

        Car[] cars = {redSUV, yellowCabriolet, greenElectricCar};

        System.out.println("In move:");
        for (Car car : cars) {
            car.accelerate(50);
            System.out.println(car);
            System.out.println("Distance Traveled: " + car.getDistanceTraveled() + " km");
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println();
        }

        System.out.println("In parking mode:");
        for (Car car : cars) {
            car.park();
            System.out.println(car);
            System.out.println("Distance Traveled: " + car.getDistanceTraveled() + " km");
            System.out.println();
        }
    }
}
