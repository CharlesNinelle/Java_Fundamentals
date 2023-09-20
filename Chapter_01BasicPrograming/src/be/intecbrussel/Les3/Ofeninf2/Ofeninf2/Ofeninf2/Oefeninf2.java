package be.intecbrussel.Les3.Ofeninf2.Ofeninf2;

public class Oefeninf2 {
    public static void main(String[] args) {
        boolean bool01 = true;
        boolean bool02 = false;

// Logisch EN (AND)
        boolean resultAnd = bool01 && bool02; // Результат: false
        System.out.println("bool01 && bool02 = " + resultAnd);

// Logische OF (OR)
        boolean resultOr = bool01 || bool02; // Результат: true
        System.out.println("bool01 || bool02 = " + resultOr);

// Logisch NIET (NOT)
        boolean resultNot01 = !bool01; // Resultaat: false
        boolean resultNot02 = !bool02; // Resultaat: true
        System.out.println("!bool01 = " + resultNot01);
        System.out.println("!bool02 = " + resultNot02);
    }
}
