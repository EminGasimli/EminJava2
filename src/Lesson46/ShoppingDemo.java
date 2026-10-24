package Lesson46;

public class ShoppingDemo {
    public static void main(String[] args) {
        Bank bank = new Bank(1000);

        Product p1 = new Product("Telefon", 800);
        Product p2 = new Product("Qulaqliq", 50);
        Product p3 = new Product("Mouse", 30);

        Shopping shopping = new Shopping();

        shopping.alisVeris(bank, p1, 1);
        shopping.alisVeris(bank, p2, 2);
        shopping.alisVeris(bank, p3, 3);
    }
}
