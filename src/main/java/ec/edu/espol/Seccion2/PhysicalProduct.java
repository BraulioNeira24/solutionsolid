package ec.edu.espol.Seccion2;

public class PhysicalProduct extends Product implements Weightable {
    private final double weight;

    public PhysicalProduct(String name, double price, double weight, ProductType type) {
        super(name, price, type);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
