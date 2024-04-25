package be.intrcbrussel.Les2;
import java.util.Scanner;
public class Oefening2Polindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw woord in: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Dit woord is een palindroom, gefeliciteerd!");
        } else {
            System.out.println("Jouw woord is geen palindroom :(");
        }

        scanner.close();
    }

    //woord controleren op palindromie
    //Cheking a word for palindromy
    public static boolean isPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();

        //Vergelijking van de originele string met de omgekeerde versie
        //Comparing the original string with the reverse version
        return word.equals(reversed.toString());
    }
}
