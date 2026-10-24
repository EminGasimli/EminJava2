package Lesson46;
import java.util.Scanner;

public class NumberConverter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci tam ededi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("Ikinci tam ededi daxil edin: ");
        int b = sc.nextInt();

        System.out.println("AND (&): " + (a & b));
        System.out.println("OR (|): " + (a | b));
        System.out.println("XOR (^): " + (a ^ b));

        System.out.print("n ededini daxil edin: ");
        int n = sc.nextInt();

        System.out.print("Shift miqdarini (m) daxil edin: ");
        int m = sc.nextInt();

        System.out.println("n << m (sol shift): " + (n << m));
        System.out.println("n >> m (sag shift): " + (n >> m));

        sc.close();
    }
}
