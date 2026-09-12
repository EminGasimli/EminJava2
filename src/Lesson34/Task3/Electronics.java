package Lesson34.Task3;

public class Electronics extends Product {
    public Electronics(double price) {
        super(price);
    }

    @Override
    public double getDiscountedPrice() {
        return price * 0.90;
    }
}