package be.intrcbrussel.Les3.Oefening3;

import java.util.Scanner;

public class Gemiddeld2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Voer getallen in, gescheiden door komma's en spaties (bijvoorbeeld 1.0, 2.0, 3.0, 4.0, 5.0");
        String input = scan.nextLine();

        //Split the string into numbers using comma and space as delimiters
        //Splits de tekenreeks in getallen en gebruik een komma en spatie als scheidingstekens
        String[] numbers = input.split(",\\s*");

        //initialize the sum and number counter
        //initialiseer de som - en getallenteller
        double sum = 0;
        int count = 0;

        //We go strings and sum the numbers
        //We doorlopen de reeks strings en tellen de getallen op

        for (String number : numbers) {
            try {
                double num = Double.parseDouble(number);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                //If it could not be converted to a number, ignore it
                //Als het niet kan worden omgezet in een getal, negeer het dan
            }
        }
        //Check that at least one number was entered
        //Controleer of er minstens één nummer is ingevoerd

        if (count > 0) {
            double gemiddeld = sum / count;
            System.out.println("gemiddeld" + gemiddeld);
        } else {

            System.out.println("Please enter at least one number");
        }
    }
}
