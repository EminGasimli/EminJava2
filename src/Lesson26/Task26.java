package Lesson26;

public class Task26 {
    static double ortalama(int a, int b) {
        return (a + b) / 2.0;
    }

    static double ortalama(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    static double ortalama(int[] arr) {
        int cem = 0;
        for (int i = 0; i < arr.length; i++) {
            cem += arr[i];
        }
        return (double) cem / arr.length;
    }

    public static void main(String[] args) {

        System.out.println(ortalama(10,20));
        System.out.println(ortalama(10,20,30));

        int[] arr = {5,10,15,20};

        System.out.println(ortalama(arr));

    }
}
