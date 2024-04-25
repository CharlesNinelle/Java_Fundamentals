package Oofening_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oefening2 {
    public static void main(String[] args) {
        List<String>strings= Arrays.asList("Amsterdam","Paris","Gent","Berlin","Ath");

        String longestString = strings.stream()
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse(null);
        String shortestString = strings.stream()
                .min((s1, s2) -> s1.length() - s2.length())
                .orElse(null);

        System.out.println("The longest string is: "+longestString);
        System.out.println("The shortest string is: "+shortestString);
    }
}
