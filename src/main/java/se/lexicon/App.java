package se.lexicon;

import se.lexicon.Model.*;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
       Drink drink1 = new Drink("CubaCola",10,"Soda","Cola");
       System.out.println(drink1.examine());
       System.out.println(drink1.use());

       Snack chips = new Snack("Hillbilly", SnackType.CHIPS, "dill");
       System.out.println(chips.examine());

        Candy gum = new Candy("HollyMolly",10,"HardCandy","Lemon");
        System.out.println(gum.examine());
        Product[] products = {drink1,chips,gum};
        VendingMachineImpl vendingMachine = new VendingMachineImpl(products);
        vendingMachine.addCurrency(501);
        System.out.println(vendingMachine.getBalance());
        //System.out.println();
        //vendingMachine.request(1);
        //System.out.println();
        //System.out.println(vendingMachine.getBalance());
        //System.out.println("---------");
        //System.out.println(Arrays.toString(vendingMachine.getProducts()));
        //System.out.println("---------");
        //System.out.println(vendingMachine.getDescription(1));
        //System.out.println("---------");
    }
}
