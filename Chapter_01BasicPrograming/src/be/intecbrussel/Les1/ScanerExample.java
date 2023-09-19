
package be.intecbrussel.Les1;

import java.util.Scanner;

public class ScanerExample {
    public static void main(String[] args) {
        Scanner myScaner = new Scanner(System.in);
        System.out.println("schrijf jouw naam");
        String userName = myScaner.nextLine();
        System.out.println("Username is:"+ userName);
    }

}
