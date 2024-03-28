package se.lexicon;

import se.lexicon.Model.*;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        IProduct[] products = {
                new Candy("Chocolate bar", 15, "Chocolate", "Sweet"),
                new Candy("Gummy Bears", 20, "Candy", "Fruity"),
                new Candy("Lollipop", 10, "Lollipop", "Sour"),
                new Snack("Potato Chips", 25, "Snack", "Dill Flavor"),
                new Snack("Pretzels", 13, "Snack", "Plain"),
                new Snack("Popcorn", 13, "Popcorn", "Salt"),
                new Drink("Cola", 20, "Soda", "Cola Flavor"),
                new Drink("Orange Juice", 17, "Juice", "Orange Flavor"),
                new Drink("Water", 15, "Water", "Plain")};

        IVendingMachine vendingMachine = new VendingMachineImpl(products);

        do {
            System.out.println("Welcome to the Vending Machine");
            System.out.println("1. Insert coins");
            System.out.println("2. View Items Available ");
            System.out.println("3. Check Balance");
            System.out.println("4. Buy Item");
            System.out.println("5. Exit");
            System.out.println("6. Enter your Choice");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to insert: ");
                    double amount = scanner.nextInt();
                    vendingMachine.addCurrency(amount);
                    break;
                case 2:
                    System.out.println(Arrays.toString(vendingMachine.getProducts()));
                    break;
                case 3:
                    System.out.println("Your balance: " + vendingMachine.getBalance());
                    break;
                case 4:
                    System.out.println("Enter id to purchase: ");
                    int itemId = scanner.nextInt();
                    vendingMachine.request(itemId);
                    System.out.println("You purchased: " +vendingMachine.getDescription(itemId)+ " Your remaining balance is: "+ vendingMachine.getBalance());
                    break;
                case 5:
                    System.out.println("Thank you for shopping!");
                    System.out.println("Here is your change: "+vendingMachine.getBalance());
                    vendingMachine.endSession();
                    break;
                default:
            }

        } while (choice <=4);
        scanner.close();
    }
}
// Create an array of products



       /*
        // Create an instance of the vending machine
        IVendingMachine vendingMachine = new VendingMachineImpl(products);

        // Test addCurrency method
        vendingMachine.addCurrency(100);
        vendingMachine.addCurrency(5);

        System.out.println(Arrays.toString(vendingMachine.getProducts()));

        // Test getBalance method
        System.out.println("Balance: " + vendingMachine.getBalance());

        // Test request method

        IProduct selectedProductIndex = vendingMachine.request(101); // Assuming product ID 1 is selected



        // Test endSession method
        int change = vendingMachine.endSession();
        System.out.println("Change returned: " + change);

        // Test getDescription method
        System.out.println("Description for product with ID 201: " + vendingMachine.getDescription(201));

        // Test getProducts method
        String[] productInfo = vendingMachine.getProducts();
        System.out.println("Products available:");
        for (String info : productInfo) {
            System.out.println(info);
        }

        */



