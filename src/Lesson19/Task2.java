package Lesson19;
import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adınızı daxil edin: ");
        String ad = sc.nextLine();
        System.out.print("Sevdiyiniz proqramlaşdırma dilini daxil edin: ");
        String dil = sc.nextLine();
        System.out.println("\nUser \"" + ad + "\" deyir:");
        System.out.println("\t\"Mənim sevdiyim dil: " + dil + "\"");
        System.out.println("Bu dili öyrənmək üçün yazıram:");
        System.out.println("\t\"C:\\Users\\" + ad + "\\Documents\\" + dil + "\\code.java\"");
    }
}
