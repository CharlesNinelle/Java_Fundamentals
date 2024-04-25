import StreamsOefening.Opdracht1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("grape");
        strings.add("pineapple");
        strings.add("orange");
        strings.add("banana");
        strings.add("mandarin");
        strings.add("peach");
        strings.add("apricot");
        strings.add("carambol");

        Opdracht1 opdracht1 = new Opdracht1();

        List<String> toUpperCaseList = opdracht1.toUpperCase(strings);
        System.out.println("toUpperCase: " + toUpperCaseList);

        List<String> filteredListA = opdracht1.filterA(strings);
        System.out.println("Filtered A: " + filteredListA);

        List<String> filteredListB = opdracht1.filterB(strings);
        System.out.println("Filtered B: " + filteredListB);

        List<String> filteredListC = opdracht1.filterC(strings);
        System.out.println("Filtered C: " + filteredListC);


        String filteredStringD = opdracht1.filterD(strings);
        System.out.println("Filtered D: " + filteredStringD);


        List<String> filteredListE = Collections.singletonList(opdracht1.filterE(strings));
        System.out.println("Filtered E: " + filteredListE);


        List<String> filteredListF = Collections.singletonList(opdracht1.filterF(strings));
        System.out.println("Filtered F: " + filteredListF);


        String filteredStringG = opdracht1.filterG(strings);
        System.out.println("Filtered G: " + filteredStringG);


        String filteredStringH = opdracht1.filterH(strings);
        System.out.println("Filtered H: " + filteredStringH);


        String filteredStringL = opdracht1.filterL(strings);
        System.out.println("Filtered L: " + filteredStringL);
    }
}
