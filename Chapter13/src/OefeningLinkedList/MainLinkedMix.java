package OefeningLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedMix  {
    public static void main(String[] args) {
        // Maak een ArrayList
        ArrayList<String> wordSet = new ArrayList<>(Arrays.asList("apple", "ananas", "wortel", "banana"));

        // Maak nog een ArrayList
        ArrayList<String> wordSet2 = new ArrayList<>(Arrays.asList("oranje", "tomato", "aardappel", "pear"));

        // Voeg de twee ArrayLists samen in een LinkedList
        List<String> mixList = new LinkedList<>(wordSet);
        mixList.addAll(wordSet2);

        // Loop door de elementen van de LinkedList
        for (String word : mixList) {
            System.out.println(word);
        }
    }
}
