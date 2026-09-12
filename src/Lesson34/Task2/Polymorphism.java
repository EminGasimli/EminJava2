package Lesson34.Task2;

public class Polymorphism {
    public void show(String name) {
        System.out.println("Ad: " + name);
    }

    public void show(String name, int age) {
        System.out.println("Ad: " + name + ", Yaş: " + age);
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.show("Ali");
        obj.show("Vali", 16);
    }
}
