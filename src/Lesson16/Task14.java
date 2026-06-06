package Lesson16;
import java.util.Scanner;

public class Task14 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ədəd daxil edin: ");
        int n = sc.nextInt();

        boolean sade = true;

        if (n < 2) {
            sade = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sade = false;
                    break;
                }
            }
        }

        if (sade) {
            System.out.println("Sadə ədəddir");
        } else {
            System.out.println("Sadə ədəd deyil");
        }
    }
}
