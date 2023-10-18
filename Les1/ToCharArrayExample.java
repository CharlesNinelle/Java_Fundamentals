package Les1;

public class ToCharArrayExample {
    public static void main(String[] args) {
        String stringToChar = "From String to a char array";
        char[] charArray = stringToChar.toCharArray();

        for (char ch:charArray){
            System.out.print(ch+"|");
        }
    }
}
