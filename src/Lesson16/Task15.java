package Lesson16;
import java.util.Scanner;

public class Task15 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int cem = 0;

        while (true) {
            System.out.print("Ədəd daxil edin: ");
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 0) {
                continue;
            }

            cem += n;
        }

        System.out.println("Müsbət ədədlərin cəmi = " + cem);
    }
    }
