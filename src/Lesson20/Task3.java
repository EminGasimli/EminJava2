package Lesson20;
import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ad daxil edin: ");
        String ad = sc.nextLine();
        if (ad.equals("Emin")) {
            System.out.println("Xoş gəldin, müəllim!");
        }
        else {
            System.out.println("Salam, " + ad);
        }
    }
}
