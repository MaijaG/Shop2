package Shop;

import javax.swing.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Shop {
    public ArrayList<Product> products = new ArrayList<>();
private ArrayList<Sale> sales = new ArrayList<>();
private ArrayList<Customer> customers = new ArrayList<>();


   /* Build a shop
   + Possible to add customers
    +possible to add products
   + possible to buy products
    possible to see sales
    +Products quantity should reduce in shop once bought
    customers will have a balance that gets reduced based on product the buy and quantity
    should show error if not enough money or product */

    public String  menu(){

        String [] availableMenu = {"1. Add Customer", "2. Add product", "3. See products list", "4. Buy product", "5. See sales", "6. See customers balance", "Quit"};
        String measurement = (String)JOptionPane.showInputDialog (
                null,
                "Select option to proceed",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, availableMenu,
                availableMenu[0]);
        return measurement;

    }

    public String addProduct() {
    String name = JOptionPane.showInputDialog("Enter product name");
    double price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price"));
    String [] availableMeasurements = {"kg", "Item", "MB", "Liters"};
    String measurement = (String)JOptionPane.showInputDialog (
                    null,
                    "Select product measurement",
                    "Product Measurement",
                    JOptionPane.QUESTION_MESSAGE,
                    null, availableMeasurements,
                    availableMeasurements[0]);

    double quantity = Double.parseDouble(JOptionPane.showInputDialog("Enter product quantity"));
    Product product = new Product(name, price, quantity, measurement);
    this.products.add(product);
    System.out.println(this.products);
    return "Product added successfully";
}
public String addCustomer() {
        String name = JOptionPane.showInputDialog("Enter customers name");
        int customersID = Integer.parseInt(JOptionPane.showInputDialog("Enter customers ID"));
        double customersBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter customers balance:"));
        Customer customer = new Customer(name, customersBalance, customersID);
        this.customers.add(customer);
    System.out.println("New customer added successfully" + customer);
        return "Customer added successfully";
}

public String seeProductsList() {
    System.out.println(products);
        return "all products" + products;
}

public String buyProduct() {
        seeProductsList();
    String name = JOptionPane.showInputDialog("Enter product name to buy");
    double quantity = Double.parseDouble(JOptionPane.showInputDialog("Enter product quantity"));

    for (Product product1: products) {
        if (product1.name.equals(name)) {
            int indx = products.indexOf(product1);
            System.out.println(indx);
            if (quantity < product1.getQuantity()) {
                quantity = product1.getQuantity() - quantity;
                product1.setQuantity(quantity);
                products.set(indx, product1);
                sales.add(new Sale(name,product1.getPrice(),quantity,product1.getMeasurement(),(quantity * product1.getPrice())));
            }
            else if (quantity == product1.getQuantity()) {
                quantity = 0;
                sales.add(new Sale(name,product1.getPrice(),quantity,product1.getMeasurement(),(quantity * product1.getPrice())));
                products.remove(product1);
                break;
            }
            else if (quantity > product1.getQuantity()) {
                System.out.println("Please enter lower number of products!");
            }
        }
    }
    return "Products bought";
}

public String salesReport() {
    System.out.println(sales);
        return "salesReport";
}

public String customersBalance(){
        return"customer balance";
}

}
