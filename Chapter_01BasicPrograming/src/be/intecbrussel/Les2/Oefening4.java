package be.intecbrussel.Les2;

import be.intecbrussel.Les1.ScannerExample2;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        //toetsenbordinvoerobject
        Scanner scanner = new Scanner(System.in);
        //informatieaanvraag
        System.out.println("Vul uw naam in:");
        String name = scanner.nextLine();

        System.out.println("Voer uw adres in:");
        String adres = scanner.nextLine();

        System.out.println("Vul je telefoonnummer:");
        String telefoonnummer = scanner.nextLine();

        scanner.close();
        //Informatie weergeven op het scherm
        System.out.println("Voer uw gegevens in:");
        System.out.println("Nam:"+name);
        System.out.println("Adress:"+adres);
        System.out.println("Adress:"+telefoonnummer);


    }

}
