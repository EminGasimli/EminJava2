package Lesson24;

public class ConstructorBook {
    String name;
    double price;
    public ConstructorBook(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void showInfo() {
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        ConstructorBook book = new ConstructorBook("Java Programming", 39.99);
        book.showInfo();
    }
}