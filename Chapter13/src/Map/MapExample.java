package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Een Map maken en elementen toevoegen
        // Создаем карту и добавляем элементы
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
// Een element opzoeken en de waarde afdrukken
        // Ищем элемент и печатаем его значение
        int ageOfAlice = map.get("Alice");
        System.out.println("Leeftijd van Alice(Возраст Алисы): " + ageOfAlice);
// Controleren of een sleutel aanwezig is in de Map
        // Проверяем, присутствует ли ключ на карте
        boolean containsBob = map.containsKey("Bob");
        System.out.println("Bevat Bob(Включая Боба)? " + containsBob);
// De grootte van de Map opvragen
        // Получаем размер папки
        int size = map.size();
        System.out.println("Grootte van de Map(Размер папки): " + size);
// Alle sleutels van de Map afdrukken
        // Распечатываем все ключи карты
        for (String key : map.keySet()) {
            System.out.println("Sleutel(Ключ): " + key);
        }
// Alle waarden van de Map afdrukken
        // Распечатываем все значения Карты
        for (int value : map.values()) {
            System.out.println("Waarde(Возраст): " + value);
        }
// De Map leegmaken
        // Очищаем папку
        map.clear();
        boolean isEmpty = map.isEmpty();
        System.out.println("Is de Map leeg?(Папка пуста?) " + isEmpty);
    }
}
