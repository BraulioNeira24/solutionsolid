package ec.edu.espol.Seccion2;

public class ClothingType implements ProductType {
    @Override
    public double calculateTax(double price) {
        return price * 0.12;
    }
}
