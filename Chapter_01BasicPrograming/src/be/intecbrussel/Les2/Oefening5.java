package be.intecbrussel.Les2;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        //toetsenbordinvoerobject
        scanner scanner = new Scanner(System.in);
        int sum = 0;
        //Nummers aanvragen
        for (int i = 1; i <=5 i++){
            System.out.print("Voer cijfers in" + i + "nummer");
            int number = scanner.next.Int();
            sum += number;
        }
        scanner.close();
        double average = (double) sum/5;
        System.out.println("Gemiddelde van 5"+average);
        }
    }
}
