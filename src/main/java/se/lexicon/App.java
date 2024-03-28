package se.lexicon;

import se.lexicon.Model.*;

import java.util.Arrays;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create an array of products
        IProduct[] products = {
                new Candy("Candy", 10, "lemonade","lemon"),
                new Snack("Chipp", 13,"Chips","dill"),
                new Drink("soda2", 15,"soda","lemon")};

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


    }
}
