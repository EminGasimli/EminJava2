package Lesson16;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("1. Oyun başlat");
            System.out.println("2. Profil");
            System.out.println("3. Çıxış");

            System.out.print("Seçim et: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Oyun başladı!");
            }
            else if (choice == 2) {
                System.out.println("Profil açıldı!");
            }
            else if (choice == 3) {
                System.out.println("Çıxış edildi.");
                break;
            }
            else {
                System.out.println("Yanlış seçim!");
            }

            System.out.println();
        }
    }
}
