package Lesson26;

public class Task18 {
    static int maks(int a, int b) {
        if (a > b) {
            return a;
        }
        else{
            return b;
        }
    }

    static int maks3(int a, int b, int c) {
        return maks(maks(a, b), c);
    }

    public static void main(String[] args) {
        System.out.println(maks(10, 20));
        System.out.println(maks3(5, 30, 15));
    }
}
