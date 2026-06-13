package Lesson17;
import java.util.Scanner;

public class Task2 {
     static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Email daxil edin: ");
        String email = sc.nextLine();

        boolean duzgundur =
                email.contains("@") &&
                        !email.endsWith(".") &&
                        !email.contains(" ");

        if (duzgundur) {
            System.out.println("Email düzgündür");

            // Bonus
            String[] hisseler = email.split("@");
            if (hisseler.length == 2) {
                System.out.println("@-dən əvvəl: " + hisseler[0]);
                System.out.println("@-dən sonra: " + hisseler[1]);
            }
        } else {
            System.out.println("Email səhvdir");
        }

        sc.close();
    }
}