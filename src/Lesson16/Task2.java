package Lesson16;

public class Task2 {
    static void main() {
        long sum = 0;
        long product = 1;

        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0) {
                sum += i;
                product *= i;
            }
        }

        System.out.println("Fərq: " + (product - sum));
    }
}
