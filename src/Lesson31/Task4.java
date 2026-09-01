package Lesson31;
import java.util.Scanner;

public class Task4 {
    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir gün seçin:");
        System.out.println("MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY");

        String input = scanner.nextLine().toUpperCase();

        Days day = Days.valueOf(input);

        switch (day) {
            case MONDAY:
                System.out.println("İş həftəsinin başlanğıcıdır");
                break;
            case TUESDAY:
                System.out.println("Həftənin ikinci iş günüdür");
                break;
            case WEDNESDAY:
                System.out.println("Həftənin ortasıdır");
                break;
            case THURSDAY:
                System.out.println("Həftə sonuna yaxınlaşırıq");
                break;
            case FRIDAY:
                System.out.println("Həftənin son iş günüdür");
                break;
            case SATURDAY:
                System.out.println("İstirahət günüdür");
                break;
            case SUNDAY:
                System.out.println("İstirahət günüdür");
                break;
        }

        scanner.close();
    }
}