package Lesson26;

public class Task20 {
    static int massivCemi(int[] arr) {
        int cem = 0;
        for (int i = 0; i < arr.length; i++)
            cem += arr[i];
        return cem;
    }

    static double massivOrtalama(int[] arr) {
        return (double) massivCemi(arr) / arr.length;
    }

    public static void main(String[] args) {
        int[] qiymetler = {85, 92, 78, 95, 88};
        System.out.println("Cəm: " + massivCemi(qiymetler));
        System.out.println("Ortalama: " + massivOrtalama(qiymetler));
    }
}
