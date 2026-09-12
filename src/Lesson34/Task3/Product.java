package Lesson34.Task3;

public class Product {
    double price;
    public Product(double price) {
        this.price = price;
    }
    public double getDiscountedPrice() {
        return price * 0.95;
    }
}