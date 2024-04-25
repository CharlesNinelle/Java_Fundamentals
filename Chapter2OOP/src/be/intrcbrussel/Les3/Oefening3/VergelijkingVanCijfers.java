package be.intrcbrussel.Les3.Oefening3;

import java.util.Scanner;

public class VergelijkingVanCijfers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Voer double nummer1:");
        double doubleNummer1 = Double.parseDouble(scan.nextLine());

        System.out.println("Voer double nummer2:");
        double doubleNummer2 = Double.parseDouble(scan.nextLine());

        if (doubleNummer1 > doubleNummer2) {
            System.out.println("Erste nummer groter");
        } else
            System.out.println("tweede nummer groter");
    }
}
