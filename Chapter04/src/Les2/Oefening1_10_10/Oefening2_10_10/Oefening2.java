package Les2.Oefening1_10_10.Oefening2_10_10;

public class Oefening2 {
    public static void main(String[] args) {
        String zin ="Maak van deze string een char array";
        char[] charArray = zin.toCharArray();
        System.out.println("Array of the chars: ");
        for (char c: charArray){
            System.out.println(c);
        }
        System.out.println();
    }
}
