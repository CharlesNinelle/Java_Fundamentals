package Map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Een TreeMap maken en elementen toevoegen
        // Создаем TreeMap и добавляем элементы
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Orange", 8);
        // Een element opzoeken en de waarde afdrukken
        // Ищем элемент и печатаем его значение
        int quantityOfApple = treeMap.get("Apple");
        System.out.println("Aantal appels(Количество яблок): " + quantityOfApple);
        // Controleren of een sleutel aanwezig is in de TreeMap
        // Проверяем, присутствует ли ключ в TreeMap
        boolean containsBanana = treeMap.containsKey("Banana");
        System.out.println("Bevat banaan(Содержит банан)? " + containsBanana);
        // De grootte van de TreeMap opvragen
        // Получаем размер TreeMap
        int size = treeMap.size();
        System.out.println("Grootte van de TreeMap(Размер карты дерева): " + size);
        // Alle sleutels van de TreeMap afdrukken
        // Распечатываем все ключи TreeMap
        for (String key : treeMap.keySet()) {
            System.out.println("Sleutel(Ключ): " + key);
        }
        // Alle waarden van de TreeMap afdrukken
        // Распечатываем все значения TreeMap
        for (int value : treeMap.values()) {
            System.out.println("Waarde(значение): " + value);
        }
        // De TreeMap leegmaken
        // Очищаем карту дерева
        treeMap.clear();
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("Is de TreeMap leeg? (Карта дерева пуста?) " + isEmpty);
    }
}
