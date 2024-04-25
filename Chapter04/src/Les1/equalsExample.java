package Les1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class equalsExample {
    public static void main(String[] args) {

        int[]array01 = {1,2,3,4};
        int[]array02 = {1,2,3,4};
        int[]array03 = {4,3,2,1};
        int[]array04 = {1,2,3,4,5};
        long[]array05 = {1,2,3,4};

        System.out.println("Are array01 and array02 equal:"+ Arrays.equals(array01,array02));
        System.out.println("Are array01 and array03 equal:"+ Arrays.equals(array01,array03));
        System.out.println("Are array01 and array04 equal:"+ Arrays.equals(array01,array04));
        //System.out.println("Are array01 and array05 equal:"+ Array.equals(array01,array05));
    }
}
