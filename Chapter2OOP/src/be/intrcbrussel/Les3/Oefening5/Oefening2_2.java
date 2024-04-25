package be.intrcbrussel.Les3.Oefening5;
import java.util.Random;
import java.util.Scanner;
public class Oefening2_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Druk op Enter om 6 getallen van 1 tot 46 te genereren");
        scanner.nextLine();

        System.out.println("Willekeurige getallen");
        for (int i=0; i<6; i++) {
            int randomNumber = random.nextInt(46);
            System.out.println(randomNumber
            );
        }
    }
}
