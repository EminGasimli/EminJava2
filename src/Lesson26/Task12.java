package Lesson26;

public class Task12 {
    static void telebeInfo(String ad, int yas, double qiymet, String sinif) {
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Qiymət: " + qiymet);
        System.out.println("Sinif: " + sinif);
        System.out.println();
    }

    public static void main(String[] args) {
        telebeInfo("Əli", 15, 85.5, "9-A");
        telebeInfo("Aysel", 14, 91.0, "8-B");
        telebeInfo("Murad", 16, 78.5, "10-C");
    }
}
