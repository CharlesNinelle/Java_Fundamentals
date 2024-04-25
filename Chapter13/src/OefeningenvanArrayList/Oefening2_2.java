package OefeningenvanArrayList;

import java.util.Arrays;

public class Oefening2_2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Arrays.setAll(numbers, i ->(int) (Math.random()*100));

        int[] reversedNumbers = Arrays.stream(numbers)
                .boxed()
                .sorted((a,b)->b-a)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(reversedNumbers));
    }
}
