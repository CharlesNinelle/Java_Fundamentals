package Les1.Collections;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> cities =new ArrayList<>();
        cities.add("Brussel");
        cities.add("Leuven");
        cities.add("Brugge");
        cities.add("Gent");

        cities.add("Leuven");

        cities.add(3,"Gent");

        System.out.println("ArrayList ->");
        cities.forEach(city -> System.out.println(city+" "));
    }
}
