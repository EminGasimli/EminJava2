package Lesson16;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int password = 1234;
        int input;

        while (true) {
            System.out.print("Şifrəni daxil et: ");
            input = sc.nextInt();

            if (input == password) {
                System.out.println("Giriş uğurludur.");
                break;
            } else {
                System.out.println("Yanlış şifrə!");
            }
        }
    }
}
