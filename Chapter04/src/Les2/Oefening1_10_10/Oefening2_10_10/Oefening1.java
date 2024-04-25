package Les2.Oefening1_10_10.Oefening2_10_10;

public class Oefening1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    int sum = sumArray(numbers);
        System.out.println("Sum Elements of Array= "+sum);
}
public static int sumArray(int[]arr){
        int sum = 0;
        for (int num:arr){
            sum+=num;
        }
        return sum;
}
}
