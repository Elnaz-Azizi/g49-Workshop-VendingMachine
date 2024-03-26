package se.lexicon.Model;

public enum SnackType {
    CHIPS(15),
    POPCORNE(10);

    private final double price;

    SnackType(double price) {
        this.price = price;

    }

    public double getPrice() {
        return price;
    }
}