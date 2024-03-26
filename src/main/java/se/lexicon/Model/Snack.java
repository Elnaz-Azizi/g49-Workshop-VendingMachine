package se.lexicon.Model;

public class Snack extends Product {
    //Fields
    private SnackType type;
    private String taste;

    //Constructor
    public Snack(String productName, SnackType type, String taste) {
        super(productName, type.getPrice());
        this.taste = taste;
        this.type = type;


    }
    //Setters

    //Getters

    //Methods
    @Override
    public String examine() {
        return "Name: " + getProductName() + "\n" + "Type: " + type + "\n" + "Taste: " + taste + "\n" + "Price: " + getPrice();
    }

    @Override
    public String use() {
        return "Name: " + getProductName() + " Price: " + getPrice();
    }
}
