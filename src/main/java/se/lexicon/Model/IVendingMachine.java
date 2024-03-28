package se.lexicon.Model;

public interface IVendingMachine {
    void addCurrency(double amount);
    int getBalance();
    IProduct request(int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();
}
