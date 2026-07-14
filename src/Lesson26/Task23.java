package Lesson26;

public class Task23 {
    static int topla(int a, int b) {
        return a + b;
    }

    static int topla(int a, int b, int c) {
        return a + b + c;
    }

    static double topla(double a, double b) {
        return a + b;
    }

    static int topla(int[] arr) {
        int cem = 0;
        for (int i = 0; i < arr.length; i++) {
            cem += arr[i];
        }
        return cem;
    }

    public static void main(String[] args) {
        System.out.println(topla(5, 3));
        System.out.println(topla(5, 3, 2));
        System.out.println(topla(4.5, 6.2));
        int[] arr = {1,2,3,4,5};
        System.out.println(topla(arr));

    }
}
