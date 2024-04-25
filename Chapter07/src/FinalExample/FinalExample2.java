package FinalExample;

public class FinalExample2 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        for (final int numbers:arr){
            System.out.println(numbers);
        }
        final StringBuilder sb = new StringBuilder("Intec");
        System.out.println("Before the change: "+sb);
        sb.append("Brussel");
        System.out.println("After the change: "+sb);
    }
}
