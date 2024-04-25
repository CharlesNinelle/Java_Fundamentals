package Oofening_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,6,7,7,7);

        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("Original of numbers is: "+numbers);
        System.out.println("List without repeating numbers is: "+uniqueNumbers);
    }
}
