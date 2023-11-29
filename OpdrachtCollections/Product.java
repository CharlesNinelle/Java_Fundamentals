package OpdrachtCollections;

public class Product {
    private String name;
    private int productID;

    public Product(String name, int productID) {
        this.name = name;
        this.productID = productID;
    }
    @Override
    public String toString(){
        return "Product{name='"+name+"', productID="+productID+'}';
    }
}
