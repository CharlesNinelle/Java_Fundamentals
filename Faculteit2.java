package Les6.ofening5;

import java.util.Scanner;
public class Faculteit2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Voer een niet-negatief geheel getal in om de faculteit te berekenen: ");

            // Controleer of de invoer een geheel getal is
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // Controleer of het ingevoerde getal niet negatief is
                if (number < 0) {
                    System.out.println("De faculteit is alleen gedefinieerd voor niet-negatieve getallen.");
                } else {
                    long factorial = 1;

                    // Bereken de faculteit van het ingevoerde getal met behulp van een lus
                    for (int i = 1; i <= number; i++) {
                        factorial *= i;
                    }

                    // Geef het resultaat weer
                    System.out.println("De faculteit van het getal " + number + " is gelijk aan " + factorial);
                }
            } else {
                // Geef een foutmelding als de invoer geen geheel getal is of negatief is
                System.out.println("U heeft geen geheel getal ingevoerd of een negatief getal. Voer alstublieft een niet-negatief geheel getal in.");
            }

            // Sluit de scanner om geheugen te bevrijden
            scanner.close();
        }
    }

