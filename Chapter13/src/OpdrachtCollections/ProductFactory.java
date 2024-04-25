package OpdrachtCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class ProductFactory {
    private ProductSorter productSorter;
    private String [] foodProducts = {"Apple","Steak","Potatoes","Salad", "Pear"};
    private String [] healthProducts = {"Face cream","Vitamins","Eye drops","Toothpaste", "Shampoo"};
    private String [] electricProducts = {"Hair dryer","Vacuum","Mixer","Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter){
        this.productSorter=productSorter;
    }

    public void createProducts(int amount){
        Map<String, Integer> productCounts = new  HashMap<>();
        for (int i = 0; i < 100; i++){
            int type = ThreadLocalRandom.current().nextInt(3);

            String name;
            switch (type){
                case 0:
                    name = foodProducts[ThreadLocalRandom.current().nextInt(foodProducts.length)];
                    break;

                case 1:
                    name = healthProducts[ThreadLocalRandom.current().nextInt(healthProducts.length)];
                    break;

                case 2:
                    name = electricProducts[ThreadLocalRandom.current().nextInt(electricProducts.length)];
                    break;
                default:
                    name = "Unknown";
            }
             Product product;
            if (type==0){
                product = new FoodProduct(name, i);
            } else if (type ==1) {
                product = new HealthProduct(name, i);
            }else {
                product = new ElectricProduct(name, i);
            }
            productSorter.sortProduct(product);
            //Het tellen van de hoeveelheid van elk type produkt
            productCounts.put(name,productCounts.getOrDefault(name,0)+1);
        }
    }
}
