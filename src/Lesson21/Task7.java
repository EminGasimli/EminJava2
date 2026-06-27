package Lesson21;

public class Task7 {
    static void main() {
        int[] ededler = {25, 10, 45, 7, 89, 34, 12, 56};
        int maksimum = ededler[0];
        int minimum = ededler[0];
        for (int i = 1; i < ededler.length; i++) {
            if (ededler[i] > maksimum) {
                maksimum = ededler[i];
            }
            if (ededler[i] < minimum) {
                minimum = ededler[i];
            }
        }
        System.out.println("Massivin elementləri:");
        for (int i = 0; i < ededler.length; i++) {
            System.out.print(ededler[i] + " ");
        }
        System.out.println("\n\nMaksimum: " + maksimum);
        System.out.println("Minimum: " + minimum);
    }
}
