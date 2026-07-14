package Lesson26;

public class Task13 {
    static void enKicik(int a, int b) {
        if (a < b)
            System.out.println("Ən kiçik: " + a);
        else
            System.out.println("Ən kiçik: " + b);
    }

    static void enKicik3(int a, int b, int c) {
        enKicik(a, b);
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Üç ədəddən ən kiçik: " + min);
    }

    public static void main(String[] args) {
        enKicik(10, 5);
        enKicik3(20, 8, 15);
    }
}
