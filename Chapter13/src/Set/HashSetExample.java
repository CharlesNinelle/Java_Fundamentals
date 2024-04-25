package Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Een HashSetmaken en elementen toevoegen
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        //set.add("0");
        set.add("Apple"); // Duplicateelement, wordt genegeerd
        System.out.println("HashSet: " + set); // [Apple, Orange, Banana]
// Controleren of een element in de HashSetzit
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple? " + containsApple); // true
// Een element uit de HashSet verwijderen
        boolean removed = set.remove("Orange");
        System.out.println("Removed Orange? " + removed); // true
// De grootte van de HashSet opvragen
        int size = set.size();
        System.out.println("Size of HashSet: " + size); // 2
// De HashSetleegmaken
        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty); // true
    }
}


