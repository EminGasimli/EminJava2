package Lesson24;

public class Product {
    String name;
    double price;
    int quantity;
    String category;
    String brand;

    public Product() {

    }
    public Product(String name) {
        this.name = name;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price, int quantity, String category, String brand) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
        System.out.println("Brand: " + brand);
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Phone", 1200);
        Product p4 = new Product("Mouse", 50, 10);
        Product p5 = new Product("Keyboard", 80, 20, "Electronics", "Logitech");
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
        p5.printInfo();
    }
}
