package Les3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Een Queue maken en elementen toevoegen
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        System.out.println("Queue: " + queue); // [Alice, Bob, Charlie]
// Het element aan de voorkant van de Queue opvragen zonder het te verwijderen
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement); // Alice
        // Het element aan de voorkant van de Queue opvragen en verwijderen
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement); // Alice
        System.out.println("Updated Queue: " + queue); // [Bob, Charlie]
// Controleren of de Queue leeg is
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue empty? " + isEmpty); // false
// De grootte van de Queue opvragen
        int size = queue.size();
        System.out.println("Size of Queue: " + size); // 2
    }
}
