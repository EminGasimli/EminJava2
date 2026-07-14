package Lesson26;

public class Task25 {
    static void goster(int eded) {
        System.out.println("Tam ədəd: " + eded);
    }

    static void goster(double eded) {
        System.out.println("Onluq ədəd: " + eded);
    }

    static void goster(String metn) {
        System.out.println("Mətn: " + metn);
    }

    static void goster(boolean deyer) {
        System.out.println("Boolean: " + deyer);
    }

    public static void main(String[] args) {
        goster(5);
        goster(3.14);
        goster("Salam");
        goster(true);
    }
}
