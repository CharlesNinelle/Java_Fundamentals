package be.intrcbrussel.Les3.Oefening3;

import java.util.Scanner;

public class Gemiddeld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Voer double nummer1:");
        double doubleNummer1 = Double.parseDouble(scan.nextLine());

        System.out.println("Voer double nummer2:");
        double doubleNummer2 = Double.parseDouble(scan.nextLine());

        System.out.println("Voer double nummer3:");
        double doubleNummer3 = Double.parseDouble(scan.nextLine());

        System.out.println("Voer double nummer4:");
        double doubleNummer4 = Double.parseDouble(scan.nextLine());

        System.out.println("Voer double nummer5:");
        double doubleNummer5 = Double.parseDouble(scan.nextLine());

        double Gemiddeld = (doubleNummer1+doubleNummer2+doubleNummer3+doubleNummer4+doubleNummer5)/5.0;
        System.out.println("Gemiddeld:" +Gemiddeld );
    }
}
