package se.lexicon.Model;

public class VendingMachine implements IVendingMachine {
    private IProduct[] products = new IProduct[0];
    private int depositPool;

    public VendingMachine(IProduct[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(double amount) {
        if (amount == 1 || amount == 2 || amount == 5 || amount == 20 || amount == 50 || amount == 100 || amount == 200 || amount == 500 || amount == 1000) {
            depositPool += amount;
        } else {
            throw new IllegalArgumentException("Amount not valid, Enter 1,2,5,10,20,50,100,200,500,1000");
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public int request(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                if (depositPool >= products[i].getPrice()) {
                    depositPool -= products[i].getPrice();
                    return i;
                } else {
                    System.out.println("Insufficient funds");
                }
            }
        }
        System.out.println("Product not found");
        return -1;
    }

    @Override
    public int endSession() {
        int change = depositPool;
        depositPool = 0;
        return change;
    }

    @Override
    public String getDescription(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                return products[i].getProductName();
            }
        }
        return "Product not found";
    }

    @Override
    public String[] getProducts() {
        String[] productInfo = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productInfo[i] = products[i].getId() + "\n" + products[i].getProductName() + "\n" + products[i].getPrice();
        }
        return productInfo;
    }
}
