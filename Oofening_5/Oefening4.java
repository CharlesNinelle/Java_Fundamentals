package Oofening_5;

import java.util.Arrays;
import java.util.List;

public class Oefening4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        long product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product of all elements of the list is: " + product);
    }
}
