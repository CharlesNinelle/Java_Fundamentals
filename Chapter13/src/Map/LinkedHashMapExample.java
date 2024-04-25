package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
// Een LinkedHashMap maken en elementen toevoegen
// Создаем LinkedHashMap и добавляем элементы
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 5);
        linkedHashMap.put("Orange", 8);
// Een element opzoeken en de waarde afdrukken
// Ищем элемент и печатаем его значение
        int quantityOfApple = linkedHashMap.get("Banana");
        System.out.println("Aantal appels: " + quantityOfApple);
// Controleren of een sleutel aanwezig is in de LinkedHashMap
// Проверяем, присутствует ли ключ в LinkedHashMap
        boolean containsBanana = linkedHashMap.containsKey("Banana");
        System.out.println("Bevat banaan(Содержит банан)? " + containsBanana);
// De grootte van de LinkedHashMap opvragen
// Получаем размер LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Grootte van de LinkedHashMap(Размер связанной хэш-карты): " + size);
// Alle sleutels van de LinkedHashMap afdrukken
// Распечатываем все ключи LinkedHashMap
        for (String key : linkedHashMap.keySet()) {
            System.out.println("Sleutel(Ключ): " + key);
        }
// Alle waarden van de LinkedHashMap afdrukken
// Распечатываем все значения LinkedHashMap
        for (int value : linkedHashMap.values()) {
            System.out.println("Waarde(значение): " + value);
        }
// De LinkedHashMap leegmaken
// Очищаем LinkedHashMap
        linkedHashMap.clear();
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("Is de LinkedHashMap leeg?(Связанная хэш-карта пуста?) " + isEmpty);
    }
}

