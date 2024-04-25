package Les6.ofening5;

public class Faculteit {

        public static void main(String[] args) {
            int number = 7;
            long factorial = calculateFactorial(number);
            System.out.println("Faculteit van een getal " + number + " gelijk aan " + factorial);
        }

        public static long calculateFactorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                long result = 1;
                for (int i = 1; i <= n; i++) {
                    result *= i;
                }
                return result;
            }
        }
    }

