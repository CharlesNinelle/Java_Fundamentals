package OpdrachtCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductSorter {
    private List<Product> products = new ArrayList<>();
    private List<FoodProduct> foodProducts = new ArrayList<>();
    private List<HealthProduct> healthProducts = new ArrayList<>();
    private List<ElectricProduct> electricProducts = new ArrayList<>();

    public int getProductCount() {
        return products.size();
    }

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    public Map<String, Integer> getProductCounts() {
        Map<String, Integer> productCounts = new HashMap<>();
        for (Product product : products) {
            String productName = product.getName();
            productCounts.put(productName, productCounts.getOrDefault(productName, 0) + 1);
        }
        return productCounts;
    }

    public void sortProduct(Product product) {
        if (!products.contains(product)) {
            products.add(product);
            if (product instanceof FoodProduct) {
                foodProducts.add((FoodProduct) product);
            } else if (product instanceof HealthProduct) {
                healthProducts.add((HealthProduct) product);
            } else if (product instanceof ElectricProduct) {
                electricProducts.add((ElectricProduct) product);
            }
        }
    }
}
