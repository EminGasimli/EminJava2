package Lesson17;
import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cümlə daxil edin: ");
        String cumle = sc.nextLine();

        // Uzunluq
        System.out.println("Uzunluq: " + cumle.length());

        // Böyük hərflə
        System.out.println("Böyük hərflə: " + cumle.toUpperCase());

        // "a" hərfinin sayı
        int aSayi = cumle.length() - cumle.replace("a", "").length();
        System.out.println("\"a\" sayı: " + aSayi);

        // Söz sayı
        String[] sozler = cumle.trim().split("\\s+");
        System.out.println("Söz sayı: " + sozler.length);

        sc.close();
    }
}