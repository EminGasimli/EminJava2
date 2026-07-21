package Lesson28;

class Calculation {
    int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    void cem(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Cəm = " + sum);
    }
}

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 15, 8};
        Calculation c = new Calculation();
        System.out.println("Max = " + c.max(arr));
        System.out.println("Min = " + c.min(arr));
        c.cem(arr);
    }
}