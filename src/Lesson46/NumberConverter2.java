package Lesson46;
import java.util.Scanner;

public class NumberConverter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Binary (2-lik) ədəd daxil edin: ");
        String binary = sc.nextLine();
        int decimal1 = Integer.parseInt(binary, 2);
        System.out.println("Decimal (10-luq): " + decimal1);

        System.out.print("Hexadecimal (16-lıq) ədəd daxil edin: ");
        String hexadecimal = sc.nextLine();
        int decimal2 = Integer.parseInt(hexadecimal, 16);
        System.out.println("Decimal (10-luq): " + decimal2);

        sc.close();
    }
}
