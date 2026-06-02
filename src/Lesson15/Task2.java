package Lesson15;

public class Task2 {
    static void main() {
        int ay = 7;

        if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12) {
            System.out.println("Bu ay 31 gündür.");
        } else if (ay == 4 || ay == 6 || ay == 9 || ay == 11) {
            System.out.println("Bu ay 30 gündür.");
        } else if (ay == 2) {
            System.out.println("Bu ay 28 gündür.");
        } else {
            System.out.println("Yanlış ay nömrəsi!");
        }
    }
}
