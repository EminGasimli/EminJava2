package Lesson21;

public class Task5 {
    static void main() {
        int[] ededler = {10, 15, 22, 7, 8, 30};

        System.out.println("Bütün elementlər:");
        for(int i = 0; i < ededler.length; i++){
            System.out.print(ededler[i] + " ");
        }

        System.out.println("\n\nCüt ədədlər:");
        for(int i = 0; i < ededler.length; i++){
            if (ededler[i] % 2 == 0) {
                System.out.print(ededler[i] + " ");
            }
        }
    }
}
