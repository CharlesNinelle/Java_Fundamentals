package Les2.Oefening1_10_10.Oefening2_10_10;

public class Oefening3 {
    public static void main(String[] args) {
        int[] num ={20, 30, 25, 35, -16, 60, -100};
        double average = calculateAverage(num);
        System.out.println("Average number is: "+average);

    }
    public static double calculateAverage(int[]arr){
        int sum =0;
        for (int num:arr){//for each перебор єлементов, om elementen in een array te herhalen
            sum+=num;//Для каждого єлемента массива прибавление следующего числа
        }
        double average = (double) sum/arr.length;
        return average;
    }
}
