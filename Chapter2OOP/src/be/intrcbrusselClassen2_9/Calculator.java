package be.intrcbrusselClassen2_9;

public class Calculator {

        public static void main(String[] args) {

        }

        // Метод для нахождения наименьшего числа среди трех чисел
        // Methode voor het vinden van het kleinste getal uit drie getallen
        // Method for finding the smallest number among three numbers
        public static int findMinimum(int a, int b, int c) {
            return Math.min(Math.min(a, b), c);
        }

        // Метод для проверки, являются ли все цифры в числе четными
        // Methode om te controleren of alle cijfers in een getal even zijn
        // Method to check if all digits in a number are even
        public static boolean areAllDigitsEven(int number1) {
            while (number1 != 0) {
                int digit = number1 % 10;
                if (digit % 2 != 0) {
                    return false;
                }
                number1 /= 10;
            }
            return true;
        }
    public static boolean areAllDigitsEven2(int number2) {
        while (number2 != 0) {
            int digit = number2 % 10;
            if (digit % 2 != 0) {
                return false;
            }
            number2 /= 10;
        }
        return true;
    }
    public static boolean areAllDigitsEven3(int number3) {
        while (number3 != 0) {
            int digit = number3 % 10;
            if (digit % 2 != 0) {
                return false;
            }
            number3 /= 10;
        }
        return true;
    }

        // Метод для выполнения сложения
        // Method for performing addition
        // Methode voor het uitvoeren van optelling
        public static int add(int a, int b) {
            return a + b;
        }

        // Метод для выполнения вычитания
        // Methode om aftrekken uit te voeren
        // Method to perform subtraction
        public static int subtract(int a, int b) {
            return a - b;
        }

        // Метод для выполнения умножения
        // Methode om vermenigvuldiging uit te voeren
        // Method to perform multiplication
        public static int multiply(int a, int b) {
            return a * b;
        }

        // Метод для выполнения деления
        // Method for performing divisionv
        // Methode voor het uitvoeren van deling
        public static double divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is impossible");
            }
            return (double) a / b;
        }

        // Метод для вычисления остатка от деления
        // Method for calculating the remainder of division
        // Methode voor het berekenen van de rest van de deling
        public static int modulus(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is impossible");
            }
            return a % b;
        }
    }

