package Lesson26;

public class Task24 {
    static double sahe(double radius) {
        return 3.14159 * radius * radius;
    }

    static double sahe(double en, double uzun) {
        return en * uzun;
    }

    static double sahe(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        System.out.println(sahe(5));
        System.out.println(sahe(5,8));
        System.out.println(sahe(3,4,5));
    }
}
