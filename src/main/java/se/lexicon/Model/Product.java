package se.lexicon.Model;

public abstract class Product extends Object {
    //Fields
    private static int sequencer = 0;
    private int id;
    private double price;

    private String productName;

    //Constructors
    public Product(String productName, double price) {
        this.price = price;
        this.productName = productName;
        this.id = getNextId();

    }

    public Product(double price, String productName) {
        this.price = price;
        this.productName = productName;
        this.id = getNextId();

    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Getters

    public int getId() {
        return id;
    }

    private static int getNextId() {
        return ++sequencer;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    //Methods
    public void setProductName(String productName) {
        if (productName == null) throw new IllegalArgumentException("productName is null");
        this.productName = productName;
    }

    public abstract String examine();

    public abstract String use();
}
