package OefeningenvanArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> gebruikersWoorden =new ArrayList<>();

        System.out.println("Voer woorden in. Voer <end> in om te voltooien");

        while (true){
            String userInput = scanner.nextLine();
            if (userInput.equals("end")){
                break;
            }
            gebruikersWoorden.add(userInput);

        }
        System.out.println("Woorden in een lijst: ");
        for (String word : gebruikersWoorden){
            System.out.println(word);
        }
    }
}
