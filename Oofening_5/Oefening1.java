package Oofening_5;

import java.util.Arrays;
import java.util.List;

public class Oefening1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()//Create a sequential stream
                .filter(number->number%2==0)//filtering even numbers
                .forEach(System.out::println);//Print every even number
    }
}
