package se.lexicon.Model;

public class Candy extends Product {
    //Fields
    private String type;
    private String taste;

    //Constructor

    public Candy(String productName, double price, String type, String taste) {
        super(productName, price);
        this.taste = taste;
        this.type = type;
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
        return "Product" + "\n" +"Name: " + getProductName() + "\n" + "Type: " + getType() + "\n" + "Taste: " + getTaste() + "\n" + "Price: " + getPrice()+ "\n";
    }

    @Override
    public String use() {
        return "Name: " + getProductName() + " Price: " + getPrice();
    }
}
