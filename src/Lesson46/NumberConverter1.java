package Lesson46;
import java.util.Scanner;

public class NumberConverter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("10-luq sistemdə ədəd daxil edin: ");
        int eded = sc.nextInt();

        System.out.println("Binary (2-lik): " + Integer.toBinaryString(eded));
        System.out.println("Octal (8-lik): " + Integer.toOctalString(eded));
        System.out.println("Hexadecimal (16-lıq): " + Integer.toHexString(eded));

        sc.close();
    }
}
