package Les1;

public class Vehicle2 {
    private String typeOfVehicle;
    public Vehicle2(){
        this("Car");
        System.out.println("Vehicle class no-args constructor");
    }
    public Vehicle2(String typeOfVehicle){

        this.typeOfVehicle=typeOfVehicle;
        System.out.println("Construcror Vehicle met parametrs");
    }
}
