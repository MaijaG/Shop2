import Shop.Shop;
import petxample.Owner;
import petxample.Pet;

import javax.swing.*;

public class Main {
   static Shop miniMart = new Shop();
    static Main main = new Main();


    public static void main(String[] args) {
        main.shopMenu();

    }

        //System.out.println(miniMart.addProduct());
     //   String result = miniMart.addProduct();
       // JOptionPane.showMessageDialog(null, miniMart.addProduct());
//String customer = miniMart.addCustomer();

      /*  Owner owner1 = new Owner("John", new Pet("Bingo", 5));
        System.out.println(owner1.sayHello());
        System.out.println(owner1.feedPet());
        System.out.println(owner1.feedPet());
        owner1.walkPet();
        owner1.walkPet();
        owner1.walkPet();*/


        public void shopMenu() {
            String input = "";
            do {
               input =miniMart.menu();
                System.out.println(input);

                switch (input) {
                    case "1. Add Customer":
                        miniMart.addCustomer();
                        break;
                    case "2. Add product":
                        miniMart.addProduct();
                        break;
                    case "3. See products list":
                        miniMart.seeProductsList();
                        break;
                    case "4. Buy product":
                        miniMart.buyProduct();
                        break;
                    case "5. See sales":
                        miniMart.salesReport();
                        break;
                    case "6. See customers balance":
                        miniMart.customersBalance();
                        break;
                }

            } while (!input.equalsIgnoreCase("Quit"));
            return;
            }

        }


