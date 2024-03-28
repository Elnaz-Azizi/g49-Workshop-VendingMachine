package se.lexicon.Model;

public class Drink extends Product {
    //Fields
    private String taste;
    private String type;

    //Constructor
    public Drink(String productName, double price, String type, String taste) {
        super(productName, price);
        this.taste = taste;
    }

    //Setters

    //Getters
    public String getType() {
        return type;
    }
    public String getTaste() {
        return taste;
    }

    //Methods
    @Override
    public String examine() {
        return "Product" + "\n" +"ID: " + getId() + "\n"+ "\n" +"Name: " + getProductName() + "\n" + "Type: " + getType() + "\n" + "Taste: " + getTaste() + "\n" + "Price: " + getPrice()+ "\n";
    }

    @Override
    public String use() {
        return "Name: " + getProductName() + " Price: " + getPrice();
    }
}
