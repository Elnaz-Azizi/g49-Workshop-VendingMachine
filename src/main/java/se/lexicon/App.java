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
        Candy candy = new Candy("Candy king",10,"Lollipop", "Strawberry");
        System.out.println(candy.examine());
        System.out.println();
        Drink drink = new Drink("Super soda", 15,"Soda", "lemon");
        System.out.println(drink.examine());
        System.out.println();
        Snack snack = new Snack("Hot tomato", 50,"Chips", "chili Tomato");
        System.out.println(snack.examine());
        System.out.println();
        IProduct[] products  = new IProduct[0];
        VendingMachine vendingMachine = new VendingMachine(products);
        vendingMachine.addCurrency(100);
        System.out.println(Arrays.toString(vendingMachine.getProducts()));
    }
}
