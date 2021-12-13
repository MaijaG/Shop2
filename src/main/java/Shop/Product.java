package Shop;

public class Product {
    public final String name;
    private final double price;
    private double quantity;
    private final String measurement;

    public Product(String name, double price, double quantity, String measurement) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measurement = measurement;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", measurement='" + measurement + '\'' +
                '}';
    }
}
