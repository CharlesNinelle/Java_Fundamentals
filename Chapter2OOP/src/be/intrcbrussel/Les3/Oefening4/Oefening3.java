package be.intrcbrussel.Les3.Oefening4;

public class Oefening3 {
    public static void main(String[] args) {
        double result = (Math.random() * 60);
        System.out.println(result);
        double result2 = Math.round(result);
        System.out.println(result2);
        {
            if (result2 % 2 == 0) {
                System.out.println("the generated number " + result2 + "are even");
            } else {
                System.out.println("the generated number " + result2 + "are not even");
            }
        }
    }
}

