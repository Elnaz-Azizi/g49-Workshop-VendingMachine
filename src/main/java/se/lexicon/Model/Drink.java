package se.lexicon.Model;

public class Drink extends Product {
    //Fields
    private String taste;
    private boolean carbo;

    //Constructor
    public Drink(String productName, double price, String type, String taste) {
        super(productName, price);
        this.taste = taste;
    }

    //Setters

    public boolean isCarbo() {
        return true;
    }

    //Getters

    public String getTaste() {
        return taste;
    }

    //Methods
    @Override
    public String examine() {
        return "Name: " + getProductName() + "\n" + "\n" + "Taste: " + getTaste() + "\n" + carbo + "Price: " + getPrice();
    }

    @Override
    public String use() {
        return "Name: " + getProductName() + " Price: " + getPrice();
    }
}
