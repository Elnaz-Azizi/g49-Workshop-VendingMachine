package se.lexicon.Model;

import java.util.Arrays;

public class VendingMachineImpl implements IVendingMachine {
    private Product[] products; // {apple, cola, chips, chokolad}
    private int depositPool; // 0
    private static final int[] VALID_AMOUNTS = {5, 10, 20};

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(double amount) { // 10
        for (ValidAmount validamount: ValidAmount.values()) { // validate the amount that should be in the array
            if (validamount.getAmount() == amount) {
                depositPool += amount;// yes-> add to depositPool
                //isValid = true;
                break;
            }
        }
        System.out.println("Invalid amount. Enter accepted amount: "+ Arrays.toString(ValidAmount.values()));
    }


    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) { // 4
        for (Product product : products) {// iterate on the array
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
        int remainingAmount = depositPool;
        depositPool = 0;
        return remainingAmount;

    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
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

