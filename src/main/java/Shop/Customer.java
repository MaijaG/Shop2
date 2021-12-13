package Shop;

public class Customer {
    private String customersName;
    private double customersBalance;
    private int customersID;

    public Customer(String customersName, double customersBalance, int customersID) {
        this.customersName = customersName;
        this.customersBalance = customersBalance;
        this.customersID = customersID;

    }

    public String getCustomersName() {
        return customersName;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public int getCustomersID() {
        return customersID;
    }

    public void setCustomersID(int customersID) {
        this.customersID = customersID;
    }

    public double getCustomersBalance() {
        return customersBalance;
    }

    public void setCustomersBalance(double customersBalance) {
        this.customersBalance = customersBalance;
    }

    @Override
    public String toString() {
        return "{Customers name: " + getCustomersName() + ", customers ID: " + getCustomersID() + " }";
    }
}
