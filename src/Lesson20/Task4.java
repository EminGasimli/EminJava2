package Lesson20;
import java.util.Scanner;

public class Task4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Söz daxil edin: ");
        String soz = sc.nextLine();
        String ters = "";
        for (int i = soz.length() - 1; i >= 0; i--) {
            ters += soz.charAt(i);
        }
        if (soz.equals(ters)) {
            System.out.println("Palindromdur.");
        }
        else {
            System.out.println("Palindrom deyil.");
        }
    }
}
