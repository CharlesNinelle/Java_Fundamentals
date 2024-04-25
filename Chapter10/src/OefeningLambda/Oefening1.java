package OefeningLambda;

import java.util.function.IntConsumer;

public class Oefening1 {
    public static void main(String[] args) {
        IntConsumer printEvenNubers = n ->{
            for(int i = 0; i<=n;i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        };
    }
}
