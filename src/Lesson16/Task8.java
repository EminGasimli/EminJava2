package Lesson16;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Ədəd daxil et: ");
            n = sc.nextInt();

            if (n > 0) {
                System.out.println("Qəbul edildi.");
                break;
            } else {
                System.out.println("Yalnız müsbət ədəd daxil edin.");
            }
        }
    }
}
