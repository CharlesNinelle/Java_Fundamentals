package Les6.ofening5;
import java.util.Scanner;
public class OefeningSom {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int som = 0; // Initialiseren van een variabele om de som op te slaan
            int getal;  // Variabele om het ingevoerde getal op te slaan

            System.out.println("Voer getallen in om ze op te tellen. Voer -1 in om te stoppen:");

            while (true) {
                getal = scanner.nextInt(); // Invoer van de gebruiker lezen

                if (getal == -1) {
                    break; // Als -1 wordt ingevoerd, verlaten we de lus
                }

                som += getal; // Het ingevoerde getal wordt toegevoegd aan de totale som
            }

            // De som van alle ingevoerde getallen (exclusief -1) wordt weergegeven
            System.out.println("Som van ingevoerde getallen: " + som);

            // Sluit de scanner om resourcelekken te voorkomen
            scanner.close();
        }
    }
