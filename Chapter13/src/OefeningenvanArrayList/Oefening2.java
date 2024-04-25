package OefeningenvanArrayList;

import java.util.Arrays;
import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i< numbers.length; i++){
            numbers[i] =random.nextInt(100);
        }
        Arrays.sort(numbers);
        for (int i =0; i< numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
