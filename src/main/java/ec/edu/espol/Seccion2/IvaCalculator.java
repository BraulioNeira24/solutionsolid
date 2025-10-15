package ec.edu.espol.Seccion2;

public class IvaCalculator {
    public double calculateTaxForProduct(Product p) {
        ProductType type = p.getProductType();
        //if (type == null) return 0;
        return type.calculateTax(p.getPrice());
    }
}
