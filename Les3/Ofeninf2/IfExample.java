package be.intecbrussel.Les3.Ofeninf2;

public class IfExample {
    public static void main(String[] args) {
        int number = 110;
        if (number < 100) {
            System.out.println("The value of number is smaler than 100");
        } else {
            System.out.println("The value of number is NOT smaler than 100");
        }

        int time = 22;
        if(time<10){
            System.out.println("Goodmorning.");
        }
        else if (time<20){
            System.out.println("Good day.");

        }
        else {
            System.out.println("Good evening.");

        }
    }

}