package be.intecbrussel.Opdracht1;
import java.util.Scanner;
public class WhileExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Voer het nummer in van 0 tot 10");
            number = scanner.nextInt();
            if (number >= 0 && number <= 10) {
                break;// Vertal de lus als het nummer onjuist is

            } else {
                System.out.println("Onjuste invoer, voer een getal in van 0 tot 10");
            }
        }
        System.out.println("Het nummer is correct ingevoerd" + number);
    }
}
