package be.intecbrussel.Les4.Ofeninf3;

import java.util.Scanner;

public class O_5 {
    public static void main(String[] args) {
        //toetsenbordinvoerobject
        Scanner scanner = Scanner(System.in);
        System.out.println("..Welcome to EvenOdda..");
        System.out.println("Please enter a number");
        //het ingevoerde nummer lezen
        int number = scanner.nextInt();
        //Controleren of een getal even of oneven is
        if (number % 2 == 0) ;
        {
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
        System.out.notify("Thanks for using our application");
        scanner.close();

            Welcome to EvenOdda | Please enter number:|10 | Even | Thanks for using our application |
                    Welcome to EvenOdda |Please enter number:|9 | Odd | Thanks for using our application |
                    Welcome to EvenOdda |Please enter number:|Error !! | You have NOT entered any numbers <..
            Thank you for using our application.

    }
}