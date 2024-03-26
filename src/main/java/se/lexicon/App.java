package se.lexicon;

import se.lexicon.Model.*;

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
    }
}
