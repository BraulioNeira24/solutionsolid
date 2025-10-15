package ec.edu.espol.Seccion2;

public class Product {
    private final String name;
    private final double price;
    private final ProductType productType;

    public Product(String name, double price) {
        this(name, price, null);
    }

    public Product(String name, double price, ProductType productType) {
        this.name = name;
        this.price = price;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductType getProductType() {
        return productType;
    }
}
