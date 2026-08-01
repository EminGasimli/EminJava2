package Lesson30;

import java.util.Random;
import java.util.Scanner;

public class LuckyNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int gizliEded = random.nextInt(50) + 1;
        int cehd = 5;

        while (cehd > 0) {
            System.out.print("1-50 arasında bir ədəd təxmin edin: ");
            int texmin = sc.nextInt();

            if (texmin == gizliEded) {
                System.out.println("Təbriklər! Şanslı rəqəmi tapdınız!");
                break;
            }
            else if (texmin > gizliEded) {
                System.out.println("Daha kiçik bir ədəd yazın.");
            }
            else {
                System.out.println("Daha böyük bir ədəd yazın.");
            }

            cehd--;

            if (cehd > 0) {
                System.out.println("Qalan cəhd: " + cehd);
            }
            else {
                System.out.println("Məğlub oldunuz!");
                System.out.println("Gizli ədəd: " + gizliEded);
            }
        }

        sc.close();
    }
}