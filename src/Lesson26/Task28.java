package Lesson26;

public class Task28 {
    static String cevir(int eded) {
        return String.valueOf(eded);
    }

    static int cevir(String metn) {
        return Integer.parseInt(metn);
    }

    static double cevir(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println(cevir(125));
        System.out.println(cevir("250"));
        System.out.println(cevir(5,2));
    }
}
