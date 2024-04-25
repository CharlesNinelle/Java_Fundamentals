package be.intrcbrussel.Les3.Oefening5;
import java.util.Random;
public class Oefeninf2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Willekeurige getallen voor lotto");
        for (int i=0; i<6; i++){
            int randomnumbers = random.nextInt(46);
            System.out.println(randomnumbers);
        }


    }
}
