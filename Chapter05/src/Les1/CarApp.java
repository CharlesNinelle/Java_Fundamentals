package Les1;

public class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("This vehicle is an:" +myCar.getTypeOfVehicle()+"\nThe brand is:"+myCar.getBrandName());

        myCar.sound();
        myCar.honk();

        //Car myCar=new Car();
    }

}
