package be.intecbrussel.Opdracht1;

public class ExampleFor5 {
    public static void main(String[] args) {
        for (int number = -10; number <= 10; number++) {
            if (number > 0) {
                System.out.println("+" + number + "");
            } else {
                System.out.println(number + "");
            }
        }
    }
}

