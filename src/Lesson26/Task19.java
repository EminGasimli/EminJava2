package Lesson26;

public class Task19 {
    static double endirimliQiymet(double qiymet, double faiz) {
        return qiymet - (qiymet * faiz / 100);
    }

    static void cekYaz(String mehsul, double ilkinQiymet, double faiz) {
        double yekun = endirimliQiymet(ilkinQiymet, faiz);
        System.out.println("Məhsul: " + mehsul);
        System.out.println("Qiymət: " + ilkinQiymet);
        System.out.println("Endirim: " + faiz + "%");
        System.out.println("Yekun: " + yekun);
    }

    public static void main(String[] args) {
        cekYaz("Telefon", 1000, 15);
    }
}
