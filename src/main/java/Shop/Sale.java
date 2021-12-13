package Shop;

public class Sale {
    public String name;
    private double price;
    private double quantity;
    private  String measurement;
    private double income;

    public Sale(String name, double price, double quantity, String measurement, double income) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measurement = measurement;
        this.income = income;
    }

    @Override
    public String toString() {
        return "Products name: + " + this.name + ", products price: " + this.price + ", products quantity " + this.quantity + this.measurement + ", INCOME: " + this.income;
    }
}
