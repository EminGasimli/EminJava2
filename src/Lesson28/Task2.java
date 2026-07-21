package Lesson28;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        if (arr.length % 2 == 1) {
            int index = arr.length / 2;
            System.out.println("Ortadakı element: " + arr[index]);
            System.out.println("İndeks: " + index);
        }
        else {
            int index1 = arr.length / 2 - 1;
            int index2 = arr.length / 2;
            System.out.println("Birinci orta element: " + arr[index1]);
            System.out.println("İndeks: " + index1);
            System.out.println("İkinci orta element: " + arr[index2]);
            System.out.println("İndeks: " + index2);
        }
    }
}