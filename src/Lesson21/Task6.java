package Lesson21;

public class Task6 {
    static void main() {
        int[] ededler = {12, 8, 25, 10, 15, 20, 18, 30, 5, 17};
        int cem = 0;
        for (int i = 0; i < ededler.length; i++) {
            cem += ededler[i];
        }
        double ortalama = (double) cem / ededler.length;
        System.out.println("Massivin elementləri:");
        for (int i = 0; i < ededler.length; i++) {
            System.out.print(ededler[i] + " ");
        }
        System.out.println("\n\ncəm: " + cem);
        System.out.println("ortalama: " + ortalama);
    }
}
