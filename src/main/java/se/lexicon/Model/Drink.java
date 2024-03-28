package se.lexicon.Model;

import java.util.UUID;

public class Drink implements IProduct{
    private static int sequencer = 200;
    private final int id;
    private String productName;
    private double price;
    private final String type;
    private final String taste;


    //Constructors
    public Drink(String productName, double price, String type, String taste){
        this.price = price;
        this.productName = productName;
        this.type = type;
        this.taste = taste;
        this.id = getNextId();
    }

    private static int getNextId() {
        return ++sequencer;
    }

    public String getType() {
        return type;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String examine() {
        return "Product"+ "\n" +"ID: " + getId() + "\n" + "\n" +"Name: " + getProductName() + "\n" + "Type: " + getType() + "\n" + "Taste: " + getTaste() + "\n" + "Price: " + getPrice()+ "\n";
    }

    @Override
    public String use() {
        return "Name: " + getProductName() + " Price: " + getPrice();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName= productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }
}
