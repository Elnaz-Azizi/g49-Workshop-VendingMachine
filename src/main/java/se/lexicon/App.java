package se.lexicon;

import se.lexicon.Model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Soda soda1 = new Soda(10,"colacola","cola");
        System.out.println(soda1.examine());
        System.out.println(soda1.use());

        Snack chips = new Snack(25,"Chipsolle", "potatis", "dill");
        System.out.println(chips.examine());

        Candy gum = new Candy(35,"Special",CandyType.GUM, CandyTaste.BLUEBERRY);
        System.out.println(gum.examine());
    }
}
