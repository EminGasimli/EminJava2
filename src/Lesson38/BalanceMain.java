package Lesson38;
import java.util.Scanner;

public class BalanceMain {
    public static void main(String[] args) {
        double balance = 100;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Pul çıxarmaq üçün məbləği daxil edin: ");
            double amount = scanner.nextDouble();
            if (amount > balance) {
                throw new Exception("Balans kifayət deyil");
            }
            balance -= amount;
            System.out.println("Pul çıxarıldı: " + amount);
            System.out.println("Qalan balans: " + balance);
        }
        catch (Exception e) {
            System.out.println("Balans kifayət deyil");
        }
        finally {
            System.out.println("Əməliyyat tamamlandı");
            scanner.close();
        }
    }
}
