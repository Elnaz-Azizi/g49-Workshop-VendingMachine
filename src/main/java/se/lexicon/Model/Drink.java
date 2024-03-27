package se.lexicon.Model;

public class Drink implements IProduct{
    private final int id;
    private String productName;
    private double price;
    private final String type;
    private final String taste;


    //Constructors
    public Drink(String productName, double price, String type, String taste, int id){
        this.price = price;
        this.productName = productName;
        this.type = type;
        this.taste = taste;
        this.id = id;
    }

    @Override
    public String examine() {
        return "Name: " + getProductName() + "\n" + "Type: " + type + "\n" + "Taste: " + taste + "\n" + "Price: " + getPrice();
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
