package Les1;

public class ExaptionsExample1 {
    public static void main(String[] args) {

        int a;

        try {
            a = Integer.parseInt("Hello");
            System.out.println("A is:" + a);

        } catch (NumberFormatException exception) {
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Exception:"+ exception);  //Code werkt
        }
        System.out.println("Code werkt");

    }
}