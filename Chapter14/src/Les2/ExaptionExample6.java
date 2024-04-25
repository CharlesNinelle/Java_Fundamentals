package Les2;

public class ExaptionExample6 {
    public static void main(String[] args) {
        ageCheck (20);
    }

    public static void ageCheck(int num) throws ArithmeticException, NumberFormatException {
        if (num < 18){
            //gooie exception met java throw keyword
            throw new ArithmeticException("U mag niet stemen");
        }
        else {
            System.out.println("U kun stemee");
        }
    }
}
