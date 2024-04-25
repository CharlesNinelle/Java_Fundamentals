package OefeningenvanArrayList;

import java.util.ArrayList;

public class Oefening1 {
    public static void main(String[] args) {
        ArrayList<String> firstlist = new ArrayList<>();
        firstlist.add("Apple");
        firstlist.add("Grape");
        firstlist.add("Mandarin");

        ArrayList<String> secondlist = new ArrayList<>();
        secondlist.add("Tomato");
        secondlist.add("Cucumber");
        secondlist.add("Aggplant");

        ArrayList<String> mergedList = new ArrayList<>(firstlist);
        mergedList.addAll(secondlist);

        System.out.println("Merged List: "+mergedList);
    }
}
