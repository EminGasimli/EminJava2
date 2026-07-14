package Lesson26;

public class Task16 {
    static int topla(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int netice = topla(5, 3);
        System.out.println(netice);
        int x = topla(5, 3) + topla(10, 2);
        System.out.println(x);

    }
}
