package Oefening2;

public class MainApp {
    public static void main(String[] args) {
        //Creating an external object
        //Een extern object maken
        OuterClass outer = new OuterClass(10,20);

        //Het creeren van een intern object
        OuterClass.MathFunctions math = outer.new MathFunctions();

        //Waarden wijzigen via de set methode
        outer.setNum1(30);
        outer.setNum2(15);

    }
}
