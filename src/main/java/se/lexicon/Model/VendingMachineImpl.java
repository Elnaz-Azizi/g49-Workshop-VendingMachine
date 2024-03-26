package se.lexicon.Model;

public class VendingMachineImpl implements IVendingMachine{
    Product[] products;
    int depositpole;


    @Override
    public void addCurrency(double amount) {
    //todo: Add money to the deposit pool. Only accepts the following values:
        //1,2,5,10,20,50,100,200,500,1000
    }

    @Override
    public int getBalance() {
        //todo:Returns the depositPool (not clearing it)
        return 0;
    }

    @Override
    public int request(int id) {
        //todo: Buy requested Product if there is enough money in the depositPool.
        return 0;
    }

    @Override
    public int endSession() {
        //todo: Returns depositPool and set it to 0
        return 0;
    }

    @Override
    public String getDescription(int id) {
        //todo: Returns a String of a Product description
        return null;
    }

    @Override
    public String[] getProducts() {
        //todo: Returns String array where each String contains the Product’s id, name and price
        return new String[0];
    }
}
