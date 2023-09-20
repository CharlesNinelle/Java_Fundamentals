package be.intecbrussel.Les4.Ofeninf3;

import java.util.Scanner;

public class O1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer een getal in van o tot 10");
        int number = scanner.nextInt();
        if (number<0){
            System.out.println("Negatief nummer");
        } else if (number>10){
            System.out.println("Nummer buiten het interval");
        } else if (number==0) {
            System.out.println("Nummer is 0");
        }else {
            System.out.println("Nummer is positief");
        }
    }
}
