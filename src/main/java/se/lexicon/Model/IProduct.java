package se.lexicon.Model;

public interface IProduct {
    String examine();
    String use();
    int getId();
    String getProductName();
    void setProductName(String productName);
    double getPrice();
    void setPrice(double price);
}
