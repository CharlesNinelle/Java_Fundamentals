package be.intecbrussel.Les3.Ofeninf2;

public class SwitchEample {
    public static void main(String[] args) {
        String str="we";
        switch (str){
            case "I":
                System.out.println("I want to become doctor.");
            case "We":
                System.out.println("We are Indian.");
            case "You":
                System.out.println("You are my crony friend.");
            case "our":
                System.out.println("Our Indian has tri-color.");
            default:
                System.out.println("It is the default statement.");

        }
    }

}
