package Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Een TreeSet maken en elementen toevoegen
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(8);
        set.add(3);
        System.out.println("TreeSet: " + set); // [2, 3, 5, 8, 10]
// Het eerste en laatste element van de TreeSet opvragen
        Integer firstElement = set.first();
        Integer lastElement = set.last();
        System.out.println("First element: " + firstElement); // 2
        System.out.println("Last element: " + lastElement); // 10
// Een element in de TreeSet zoeken dat groter is dan een opgegeven waarde
        Integer higherValue = set.higher(5);
        System.out.println("Element higher than 5: " + higherValue); // 8
// Een element in de TreeSet zoeken dat kleiner is dan een opgegeven waarde
        Integer lowerValue = set.lower(5);
        System.out.println("Element lower than 5: " + lowerValue); // 3
// De TreeSet afdrukken in omgekeerde volgorde
        TreeSet<Integer> descendingSet = (TreeSet<Integer>) set.descendingSet();
        System.out.println("Descending TreeSet: " + descendingSet); // [10, 8, 5, 3, 2]
// Een subset van de TreeSet maken
        TreeSet<Integer> subset = (TreeSet<Integer>) set.subSet(3, 8);
        System.out.println("Subset TreeSet: " + subset); // [3, 5]
// De TreeSet leegmaken
        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is TreeSet empty? " + isEmpty); // true
    }
}

