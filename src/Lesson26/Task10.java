package Lesson26;

public class Task10 {
    static void daireSahesi(double radius) {
        double sahe = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Sahə: " + sahe);
    }

    public static void main(String[] args) {
        daireSahesi(5);
        daireSahesi(10);
        daireSahesi(2.5);
    }
}
