package OefeningLinkedList;

import java.util.Arrays;
import java.util.List;

public class IntegerListExample {
    public static void main(String[] args) {
        // een lijst met getallen
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Roep de methoden op
        printList(list);
        printSum(list);
        printAverage(list);
    }

    // Methode om de lijst af te drukken
    private static void printList(List<Integer> list) {
        System.out.println("List:");
        for (Integer number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Methode om de som van de getallen in de lijst af te drukken
    private static void printSum(List<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        System.out.println("Sum of the numbers in the list: " + sum);
    }

    // Methode om het gemiddelde van de getallen in de lijst af te drukken
    private static void printAverage(List<Integer> list) {
        if (!list.isEmpty()) {
            double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
            System.out.println("Average of the numbers in the list: " + average);
        } else {
            System.out.println("List is empty. Cannot calculate average.");
        }
    }
}
