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
    public IProduct request(int id) { // 4
        for (IProduct product : products) {// iterate on the array
            if (product.getId() == id) { // check the id to find
                if (depositPool >= product.getPrice()) {// if id exist in the array of products
                    depositPool -= product.getPrice();// count and modify the depositPool
                    return product;// return the found product
                } else {
                    System.out.println("Not enough money");
                }
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        int change = depositPool;
        depositPool = 0;
        return change;
    }

    @Override
    public String getDescription(int id) {
        for (IProduct product : products) {
            if (product.getId() == id) {
                return product.use();
            }
        }
        return "Product not found";
    }

    @Override
    public String[] getProducts() {
        String[] productInfo = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productInfo[i] = products[i].examine();
        }
        return productInfo;
    }
}
