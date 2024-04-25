package Les2.Oefening1_10_10.Oefening3_11_10;

public class Ofening1 {
    public static void main(String[] args) {
        String myString ="Char Array!";
        char[] charArray = myString.toCharArray();

        for (int i = 0; i< charArray.length; i++){
            System.out.printf(" |%d=%c|", i, charArray[i]);
        }
    }
}
