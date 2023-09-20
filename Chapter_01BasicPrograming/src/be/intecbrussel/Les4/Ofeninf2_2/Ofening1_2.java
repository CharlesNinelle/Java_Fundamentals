package be.intecbrussel.Les4.Ofeninf2_2;

public class Ofening1_2 {
    public static void main(String[] args) {
       //variabele waarde
        boolean bool1 = true;
        boolean bool2 = false;
        //gebruik van logische operatoren
        boolean resultAnd = bool1 && bool2; // AND
        boolean resultOr = bool1 || bool2; // OR
        boolean resultNot1 = !bool1; // NOT1
        boolean resultNot2 = !bool2; // NOT2
        //Uitvoer van het resultaat
        System.out.println("Vergelijkingsresultaat bool1 && bool2" +resultAnd);
        System.out.println("Vergelijkingsresultaat bool1 || bool2" +resultOr);
        System.out.println("Vergelijkingsresultaat !bool1" +resultNot1);
        System.out.println("Vergelijkingsresultaat !bool2" +resultNot2);


    }
}
