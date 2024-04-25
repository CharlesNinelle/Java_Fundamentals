package Les1;

public class Car2 extends Vehicle2 {
        public Car2(){
            System.out.println("No args constractor Car");
        }
        Car2(String typeOfVehicle){
            super(typeOfVehicle);
            System.out.println("Car constractor");
        }
}
