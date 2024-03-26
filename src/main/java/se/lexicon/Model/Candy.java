package se.lexicon.Model;

public class Candy extends Product{
    //Fields
    private CandyType candyType;

    private CandyTaste candyTaste;

    //Constructor

    public Candy(double price, String productName, CandyType candyType, CandyTaste candyTaste) {
        super(price, productName);
        this.candyType = candyType;
        this.candyTaste = candyTaste;
    }

    //Setters

    //Getters

    //Methods
    @Override
    public String examine() {
        return "This candy has the added taste of " + candyTaste + ", The type is: "+ candyType + ", with the name:" +getProductName()+ ", Price:" + getPrice();
    }
    @Override
    public String use(){
        return "Name: " + getProductName()+ " Price: " + getPrice();
    }
}
