package Les2.Oefening1_10_10;

public class Oefeninfg3 {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8,9,10};
        findEvenNumbers(numbers);
        }
        public static void findEvenNumbers(int[]arr){
            System.out.println("Even numbers in de array: ");
            for (int num: arr){
                if (num%2==0){
                    System.out.println(num+" ");
                }
            }
        }
}
