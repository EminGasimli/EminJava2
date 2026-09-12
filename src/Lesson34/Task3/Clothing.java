package Lesson34.Task3;

public class Clothing extends Product {
    public Clothing(double price) {
        super(price);
    }

    @Override
    public double getDiscountedPrice() {
        return price * 0.80;
    }
}
