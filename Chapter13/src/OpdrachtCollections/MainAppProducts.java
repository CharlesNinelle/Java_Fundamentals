package OpdrachtCollections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainAppProducts {
    public static void main(String[] args) {
        // een ProductSorter-object om producten te sorteren
        // объект ProductSorter для сортировки продуктов
        // a ProductSorter object to sort products
        ProductSorter productSorter = new ProductSorter();

        // een ProductFactory-object om producten te genereren en te sorteren
        // объект ProductFactory для генерации и сортировки продуктов
        // a ProductFactory object to generate and sort products
        ProductFactory productFactory = new ProductFactory(productSorter);

        // 100 willekeurige producten
        // 100 случайных продуктов
        // 100 random products
        productFactory.createProducts(100);

        // de samenvatting van de gegenereerde producten
        // сводка сгенерированных продуктов
        // the summary of the generated products
        System.out.println("│★★★★★★★★★★★★★★★★★★★★★│");
        System.out.println(" Total Products produced: " + productSorter.getProductCount());
        System.out.println("│★★★★★★★★★★★★★★★★★★★★★│");
        System.out.println(" ○ Food Products: " + productSorter.getFoodProducts().size());
        System.out.println(" ■ Health Products: " + productSorter.getHealthProducts().size());
        System.out.println(" ▲ Electric Products: " + productSorter.getElectricProducts().size());
        System.out.println("│★★★★★★★★★★★★★★★★★★★★★│");

        // gedetailleerde informatie over elk type product
        // подробная информацию о каждом типе продукта
        // detailed information about each type of product
        printProductInfo("Food Products", productSorter.getFoodProducts());
        printProductInfo("Health Products", productSorter.getHealthProducts());
        printProductInfo("Electric Products", productSorter.getElectricProducts());
    }

    // Methode voor het weergeven van informatie over producten
    // Метод отображения информации о продуктах
    // Method for displaying information about products
    private static void printProductInfo(String category, List<? extends Product> productList) {
        System.out.println(category + ": " + productList.size());

        // een kaart om het aantal producten per naam bij te houden
        // карта для отслеживания количества продуктов по имени
        // a map to track the count of products per name
        Map<String, Integer> productCounts = new HashMap<>();
        for (Product product : productList) {
            String productName = product.getName();
            productCounts.put(productName, productCounts.getOrDefault(productName, 0) + 1);
        }

        // het aantal items per productnaam
        // количество элементов для каждого имени продукта
        // the count of items per product name
        for (Map.Entry<String, Integer> entry : productCounts.entrySet()) {
            System.out.println(" " + entry.getKey() + ": " + entry.getValue() + " items");
        }
    }
}
