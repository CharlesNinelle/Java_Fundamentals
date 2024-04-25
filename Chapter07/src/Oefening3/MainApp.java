package Oefening3;

public class MainApp {
    public static void main(String[] args) {
        //Instances of planets+display
        System.out.println();
        System.out.println("***************************************************");
        Planet sun = new Planet("Sun is",696340.0);
        System.out.println("Circumference of "+ sun.getName()+": "+sun.calculaterCircumference()+" km     *");
        Planet earth = new Planet("Earth is",6371.0);
        System.out.println("Circumference of "+ earth.getName()+": "+earth.calculaterCircumference()+" km  *");
        Planet moon = new Planet("Moon is",1737.0);
        System.out.println("Circumference of "+ moon.getName()+": "+moon.calculaterCircumference()+" km   *");
        System.out.println("***************************************************");
    }
}
