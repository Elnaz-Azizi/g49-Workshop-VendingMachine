package se.lexicon.Model;

public class VendingMachineImpl implements IVendingMachine {
    private final IProduct[] products;
    private int depositPool;

    public VendingMachineImpl(IProduct[] products) {
        this.products = products;
        this.depositPool = 0;
    }

    @Override
    public void addCurrency(double amount) {
        // Check if the amount is a valid denomination
        if (amount == 1 || amount == 2 || amount == 5 || amount == 10 || amount == 20 ||
                amount == 50 || amount == 100 || amount == 200 || amount == 500 || amount == 1000) {
            // Add the amount to the deposit pool
            depositPool += amount;
        } else {
            // Throw an exception if the amount is not a valid denomination
            throw new IllegalArgumentException("Invalid denomination: " + amount);
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
