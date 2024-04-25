package be.intrcbrussel.Les3.Oefening3;

import java.util.Scanner;

public class AdressTelefoonnummer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Voer uw naam in:");
        String userNaam = scan.nextLine();

        System.out.println("Voer uw adres in:");
        String userAdres = scan.nextLine();

        System.out.println("Voer uw telefoonnummer in:");
        String userTelefoonnummer = scan.nextLine();

        System.out.println("uw naam is: " +userNaam);
        System.out.println("uw adres is: " +userAdres);
        System.out.println("userTelefoonnummer is: " +userTelefoonnummer);
    }
}
