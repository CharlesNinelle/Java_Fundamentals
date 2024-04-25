import java.math.BigDecimal;
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

        scanner.close();
    }

    private static double calculateExpression(String expression) {
        Stack<BigDecimal> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch) || ch == '.') {
                BigDecimal num = parseNumber(expression, i);
                numbers.push(num);
                i += num.toString().length() - 1;
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                handleClosingParentheses(numbers, operators);
            } else if (isOperator(ch)) {
                handleOperator(ch, numbers, operators);
            }
        }

        while (!operators.isEmpty()) {
            applyRemainingOperators(numbers, operators);
        }

        if (numbers.size() == 1 && operators.isEmpty()) {
            return numbers.pop().doubleValue();
        } else {
            throw new ArithmeticException("Invalid expression");
        }
    }

    private static BigDecimal parseNumber(String expression, int startIndex) {
        StringBuilder num = new StringBuilder();

        while (startIndex < expression.length() &&
                (Character.isDigit(expression.charAt(startIndex)) || expression.charAt(startIndex) == '.')) {
            num.append(expression.charAt(startIndex));
            startIndex++;
        }

        if (num.length() == 0) {
            throw new ArithmeticException("Invalid expression format");
        }

        return new BigDecimal(num.toString());
    }

    private static void handleClosingParentheses(Stack<BigDecimal> numbers, Stack<Character> operators) {
        while (operators.peek() != '(') {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }
        operators.pop(); // Pop '('
    }

    private static void handleOperator(char operator, Stack<BigDecimal> numbers, Stack<Character> operators) {
        while (!operators.isEmpty() && precedence(operator) <= precedence(operators.peek())) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }
        operators.push(operator);
    }

    private static void applyRemainingOperators(Stack<BigDecimal> numbers, Stack<Character> operators) {
        numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
        }
        return -1;
    }

    private static BigDecimal applyOperation(char operator, BigDecimal b, BigDecimal a) {
        switch (operator) {
            case '+':
                return a.add(b);
            case '-':
                return a.subtract(b);
            case '*':
                return a.multiply(b);
            case '/':
                if (b.equals(BigDecimal.ZERO)) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return a.divide(b);
            case '%':
                if (b.equals(BigDecimal.ZERO)) {
                    throw new ArithmeticException("The remainder of division by zero is unacceptable");
                }
                return a.remainder(b);
        }
        return BigDecimal.ZERO;
    }
}
