package be.intecbrussel.Opdracht1;

public class ExampleFor7 {
    public static void main(String[] args) {
        for (int number=0; number<= 10000; number++){
            if (number % 6 == 0 && number % 28 == 0) {
                System.out.println(number);
            }
        }
    }
}
