package Les1;

import java.util.Arrays;

public class CopyOfMethodExample {
    public static void main(String[] args) {
        int[]originalArray={1,2,3};
        System.out.println("Original Array");
        for (int index =0; index<originalArray.length; index++)
            System.out.println(originalArray[index]+" ");

        int[]newArray = Arrays.copyOf(originalArray,5);
        newArray[3]=11;
        newArray[4]=55;
        System.out.println("\nNew array newArray after modification:");
        for(int index=0;index<newArray.length;index++){
            System.out.println(newArray[index]+" ");
        }
    }
}
