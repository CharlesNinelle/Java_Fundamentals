package Les1;

public class ExaptionsExample4 {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt("Hello");
        System.out.println(num);
        int result = 5 / 0;
        System.out.println(result);
    } catch (ArithmeticException | NumberFormatException anException){
        System.out.println(anException.getMessage());
    }
}
}