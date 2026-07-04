package Lesson22;

public class Task5 {
    static void main() {
        int[] arr = {3, 5, 2, 42, 42, 2, 5, 2};
        int target = 5;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    count++;
                    System.out.println(arr[i] + " + " + arr[j]);
                }
            }
        }
        System.out.println("Cütlərin sayı: " + count);
    }
}
