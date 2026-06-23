package Lesson20;
import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String gizliSoz = "java";
        String daxilEdilen;
        do {
            System.out.print("Gizli sözü daxil edin: ");
            daxilEdilen = sc.nextLine();
        } while (!daxilEdilen.equals(gizliSoz));
        System.out.println("Təbriklər! Gizli sözü tapdınız.");
    }
}
