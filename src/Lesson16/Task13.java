package Lesson16;

public class Task13 {
    static void main() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
