package ec.edu.espol.Seccion2;

public class BookType implements ProductType {
    @Override
    public double calculateTax(double price) {
        return 0;
    }
}
