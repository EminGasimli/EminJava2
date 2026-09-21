package Lesson37;
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Index daxil edin: ");

        try {
            int index = scanner.nextInt();
            System.out.println("Element: " + numbers[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Belə index mövcud deyil!");
        }

        scanner.close();
    }
}
