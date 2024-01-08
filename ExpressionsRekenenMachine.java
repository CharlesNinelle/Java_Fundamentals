import java.util.Scanner;
import java.util.Stack;

public class ExpressionsRekenenMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a mathematical expression (or 'exit' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("The program is complete.");
                break;
            }

            try {
                double result = calculateExpression(input);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    public static double calculateExpression(String expression) {
        // Stacks to hold numbers and operators during expression evaluation
        // Стеки для хранения чисел и операторов во время вычисления выражения
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        // Iterate through each character in the expression
        // Перебираем каждый символ в выражении
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is a digit or a dot, handle numeric values
            // Если символ представляет собой цифру или точку, обрабатываем числовые значения
            if (Character.isDigit(ch) || ch == '.') {
                StringBuilder num = new StringBuilder();

                // Collect all consecutive digits and dots to form a number
                // Собираем все последовательные цифры и точки, чтобы сформировать число
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    num.append(expression.charAt(i));
                    i++;
                }
                i--;

                // Parse the collected numeric string and push it to the numbers stack
                // Анализируем собранную числовую строку и помещаем ее в стек чисел
                numbers.push(Double.parseDouble(num.toString()));
            } else if (ch == '(') {//Handle opening parentheses //Обрабатываем открывающиеся круглые скобки
                operators.push(ch);
            } else if (ch == ')') {//Handle closing parentheses //Обработка закрывающих скобок

                // Evaluate and push operators until an opening parenthesis is encountered
                // Вычисляем и перемещаем операторы до тех пор, пока не встретим открывающуюся скобку
                while (operators.peek() != '(') {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.pop(); // Pop '('
            } else if (isOperator(ch)) {

                // Evaluate and push operators with higher or equal precedence until an operator with lower precedence is encountered
                // Оцениваем и помещаем операторы с более высоким или равным приоритетом, пока не встретим оператор с более низким приоритетом
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                // Push the current operator to the operators stack
                // Помещаем текущий оператор в стек операторов
                operators.push(ch);
            }
        }

        // Evaluate and push remaining operators after processing all characters
        // Оцениваем и помещаем оставшиеся операторы после обработки всех символов
        while (!operators.isEmpty()) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }

        // Check if the final state is valid and return the result or throw an exception
        // Проверяем, допустимо ли конечное состояние, и возвращаем результат или выдаем исключение
        if (numbers.size() == 1 && operators.isEmpty()) {
            return numbers.pop();
        } else {
            throw new ArithmeticException("Invalid expression");
        }
    }

    private static boolean isOperator(char ch) {
        // Check if the character is one of the recognized operators (+, -, *, /, %)
        // Проверяем, является ли символ одним из распознаваемых операторов (+, -, *, /, %)
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
    }

    private static int precedence(char operator) {
        // Switch statement to evaluate the precedence of the operator
        // Оператор Switch для оценки приоритета оператора
        switch (operator) {
            case '+':
            case '-':
                return 1; //Precedence level 1 for addition and subtraction //Уровень приоритета 1 для сложения и вычитания
            case '*':
            case '/':
            case '%':
                return 2;//Precedence level 2 for multiplication, division, and modulus //Уровень приоритета 2 для умножения, деления и модуля
        }
        return -1;//If the operator is not recognized, return -1 //Если оператор не распознан, возвращаем -1
    }

    private static double applyOperation(char operator, double b, double a) {
        // Switch statement to determine and execute the appropriate arithmetic operation
        // Оператор переключения для определения и выполнения соответствующей арифметической операции
        switch (operator) {
            case '+':
                return a + b;  //Addition //Добавление
            case '-':
                return a - b;  //Subtraction
            case '*':
                return a * b;  //Multiplication
            case '/':
                // Check for division by zero and throw an exception if the divisor is zero
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return a / b;  // Division
            case '%':
                // Check for calculating modulus with zero divisor and throw an exception if true
                if (b == 0) {
                    throw new ArithmeticException("The remainder of division by zero is unacceptable");
                }
                return a % b;  // Modulus
        }
        // If the operator is not recognized, return 0 (default value)
        return 0;
    }
}
