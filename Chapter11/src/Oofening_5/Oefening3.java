package Oofening_5;

import java.util.Arrays;
import java.util.List;

public class Oefening3 {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(2,4,6,8,10,12,14,16,18);

        boolean allEven = numbers.stream().allMatch(num->num % 2 == 0);

        if (allEven){
            System.out.println("The list contains only even numbers");
        }else {
            System.out.println("The list contains at least one odd number");
        }
    }
}
