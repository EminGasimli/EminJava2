package Lesson26;

public class Task3 {
    static void maksimum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Maksimum: " + max);
    }

    public static void main(String[] args) {
        maksimum(5, 8, 2);
        maksimum(20, 10, 15);
    }
}
