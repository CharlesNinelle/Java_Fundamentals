package be.intecbrussel.Opdracht1;

public class ExampleFor4_1 {
    public static void main(String[] args) {
        String alphabet ="abcdefghijklmnopqrstuvwwyz";
        for ( int i= alphabet.length()-1; i>=0; i--){
            char letter = alphabet.charAt(i);
            System.out.println(letter+"");
        }
    }
}
