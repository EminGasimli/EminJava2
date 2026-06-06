package Lesson16;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        if (original == reversed) {
            System.out.println("Polindromdur");
        } else {
            System.out.println("Polindrom deyil");
        }
    }
}
