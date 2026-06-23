package Lesson20;
import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ad daxil edin: ");
        String ad = sc.nextLine();
        for (int i = ad.length() - 1; i >= 0; i--) {
            System.out.print(ad.charAt(i));
        }
    }
}
