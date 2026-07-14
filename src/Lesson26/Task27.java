package Lesson26;

public class Task27 {
    String ad;
    int yas;

    Task27() {
        ad = "Naməlum";
        yas = 0;
        info();
    }

    Task27(String ad) {
        this.ad = ad;
        yas = 0;
        info();
    }

    Task27(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
        info();
    }

    void info() {
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println();
    }

    public static void main(String[] args) {
        new Task27();
        new Task27("Əli");
        new Task27("Murad",18);
    }
}
