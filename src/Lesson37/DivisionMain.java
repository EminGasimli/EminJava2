package Lesson37;
import java.util.Scanner;

public class DivisionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Birinci ədədi daxil edin: ");
            int a = scanner.nextInt();
            System.out.print("İkinci ədədi daxil edin: ");
            int b = scanner.nextInt();
            System.out.println("Nəticə: " + (a / b));
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Düzgün ədəd daxil edin");
        }
        catch (ArithmeticException e) {
            System.out.println("0-a bölmək olmaz!");
        }

        scanner.close();
    }
}
