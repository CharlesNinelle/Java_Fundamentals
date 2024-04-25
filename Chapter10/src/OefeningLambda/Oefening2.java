package OefeningLambda;

import java.util.function.BiConsumer;

public class Oefening2 {
    public static void main(String[] args) {
        BiConsumer<Integer, String> printNumbers=(n, type)->{
            for(int i = 0; i <= n; i++){
                if ((i % 2==0 && type.equals("even"))||(i % 2!=0 && type.equals("odd"))){
                    System.out.println(i);
                }
            }
        };
        printNumbers.accept(10,"even");
        printNumbers.accept(10,"odd");
    }
}
