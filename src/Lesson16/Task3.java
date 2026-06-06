package Lesson16;

public class Task3 {
    static void main() {
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0 && i % 4 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
