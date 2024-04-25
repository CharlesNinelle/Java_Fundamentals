package Les1;

public class ExaptionExample1_2 {
        public static void main(String[] args) {

            String[] maanden = {"January", "February", "Mart", "April"};

            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println(maanden[i] + " ");
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Exception" + exception);
            } finally {
                System.out.println("Deze code  werkt ");

            }
        }
    }
