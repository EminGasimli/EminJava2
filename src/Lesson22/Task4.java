package Lesson22;

public class Task4 {
    static void main() {
        int[] arr = {15, 7, 28, 12, 28, 20};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Ən böyük: " + max);
        System.out.println("İkinci ən böyük: " + secondMax);
    }
}
