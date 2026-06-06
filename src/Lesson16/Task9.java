package Lesson16;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secret = 7;
        int guess;

        while (true) {
            System.out.print("Rəqəmi tap: ");
            guess = sc.nextInt();

            if (guess > secret) {
                System.out.println("Böyük yazmısan.");
            }
            else if (guess < secret) {
                System.out.println("Kiçik yazmısan.");
            }
            else {
                System.out.println("Tapdın!");
                break;
            }
        }
    }
}
