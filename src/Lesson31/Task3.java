package Lesson31;
import java.math.BigInteger;

public class Task3 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("999999999999999999999");

        System.out.println("Birinci böyük ədəd: " + a);

        BigInteger b = new BigInteger("888888888888888888888");

        BigInteger cem = a.add(b);

        System.out.println("İkinci böyük ədəd: " + b);
        System.out.println("Cəm: " + cem);
    }
}