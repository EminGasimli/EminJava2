package Lesson15;

public class Task3 {
    static void main() {
        int saat = 18;

        if (saat >= 6 && saat <= 11) {
            System.out.println("Səhər");
        } else if (saat >= 12 && saat <= 17) {
            System.out.println("Günorta");
        } else if (saat >= 18 && saat <= 23) {
            System.out.println("Axşam");
        } else if (saat >= 0 && saat <= 5) {
            System.out.println("Gecə");
        } else {
            System.out.println("Yanlış saat daxil edilib!");
        }
    }
}
