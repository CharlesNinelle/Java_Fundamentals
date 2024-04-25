package be.intrcbrusselClassen2_9;

    public class MainCalc {
        public static void main(String[] args) {
            // gebruik methoden
            int min = Calculator.findMinimum(5, 9, 3);
            System.out.println("Smallest number: " + min);

            boolean areDigitsEven = Calculator.areAllDigitsEven(8642);//Этот метод выполняет проверку, являются ли все цифры данного целого числа четными. Если все цифры четные, метод возвращает true, иначе он возвращает false.
            //Deze methode controleert of alle cijfers van een bepaald geheel getal even zijn. Als alle cijfers even zijn, retourneert de methode waar, anders retourneert deze onwaar.
            System.out.println("All numbers are even: " + areDigitsEven);

            boolean areDigitsEven2 = Calculator.areAllDigitsEven2(123);//Этот метод выполняет проверку, являются ли все цифры данного целого числа четными. Если все цифры четные, метод возвращает true, иначе он возвращает false.
            //Deze methode controleert of alle cijfers van een bepaald geheel getal even zijn. Als alle cijfers even zijn, retourneert de methode waar, anders retourneert deze onwaar.
            System.out.println("All numbers are even: " + areDigitsEven2);

            boolean areDigitsEven3 = Calculator.areAllDigitsEven3(200);//Этот метод выполняет проверку, являются ли все цифры данного целого числа четными. Если все цифры четные, метод возвращает true, иначе он возвращает false.
            //Deze methode controleert of alle cijfers van een bepaald geheel getal even zijn. Als alle cijfers even zijn, retourneert de methode waar, anders retourneert deze onwaar.
            System.out.println("All numbers are even: " + areDigitsEven3);

            int sum = Calculator.add(10, 5);
            int difference = Calculator.subtract(10, 5);
            int product = Calculator.multiply(10, 5);
            double quotient = Calculator.divide(10, 5); // double to save the decimal part//double чтобы сохранить десятичную часть//double om het decimale gedeelte op te slaan
            int remainder = Calculator.modulus(10, 5);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder of the division: " + remainder);
        }
    }
