package ec.edu.espol.Seccion2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
