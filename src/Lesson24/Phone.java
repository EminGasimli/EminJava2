package Lesson24;

public class Phone {
    String brand;
    double price;
    public Phone(String brand) {
        this.brand = brand;
    }
    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung");
        Phone phone2 = new Phone("iPhone", 2500);
        phone1.showInfo();
        phone2.showInfo();
    }
}
