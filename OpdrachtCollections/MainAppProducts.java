package OpdrachtCollections;

public class MainAppProducts {
        public static void main(String[] args) {
            ProductSorter productSorter = new ProductSorter();
            ProductFactory productFactory = new ProductFactory(productSorter);

            productFactory.createProducts(100);
            System.out.println("│★★★★★★★★★★★★★★★★★★★★★│");
            System.out.println(" Total Products produced: " + productSorter.getProductCount());
            System.out.println("│★★★★★★★★★★★★★★★★★★★★★│");
            System.out.println("   ○  Food Products: " + productSorter.getFoodProducts().size());
            System.out.println("   ■  Health Products: " + productSorter.getHealthProducts().size());
            System.out.println("   ▲  Electric Products: " + productSorter.getElectricProducts().size());
            System.out.println("│★★★★★★★★★★★★★★★★★★★★★│");
        }
    }
