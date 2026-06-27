package Lesson21;

public class Task8 {
    static void main() {
        int[] massiv1 = {10, 20, 30, 40};
        int[] massiv2 = {50, 60, 70};

        int[] yeniMassiv = new int[massiv1.length + massiv2.length];

        for (int i = 0; i < massiv1.length; i++) {
            yeniMassiv[i] = massiv1[i];
        }

        for (int i = 0; i < massiv2.length; i++) {
            yeniMassiv[massiv1.length + i] = massiv2[i];
        }

        System.out.println("Yeni massiv:");
        for (int i = 0; i < yeniMassiv.length; i++) {
            System.out.print(yeniMassiv[i] + " ");
        }

        System.out.println("\n\nElement sayı: " + yeniMassiv.length);
    }
}
