package Lesson23;

public class Task1 {

    public static void main(String[] args) {

        Heyvan h = new Heyvan();
        h.ad = "Boncuk";
        h.yas = 3;
        h.nov = "Pişik";
        h.melumatGoster();

        Telebe t = new Telebe();
        t.ad = "Əli";
        t.sinifNomresi = 7;
        t.ortaQiymet = 85.5;
        t.melumat();
        System.out.println("Keçib: " + t.kechiblimi());

        Hesablayici hs = new Hesablayici();
        hs.eded1 = 10;
        hs.eded2 = 3;
        System.out.println("Toplama: " + hs.topla());
        System.out.println("Çıxma: " + hs.cix());
        System.out.println("Vurma: " + hs.vur());
        System.out.println("Bölmə: " + hs.bol());

        Kitab k = new Kitab();
        k.kitabAdi = "Java";
        k.muellif = "James Gosling";
        k.sehifeSayi = 300;
        k.qiymet = 40;
        k.bilgiGoster();
        System.out.println("Qalın kitabdır: " + k.qalinKitabmi());
        System.out.println("20% endirimli qiymət: " + k.endirimliQiymet(20));

        Duzbucaqli d = new Duzbucaqli();
        d.en = 5;
        d.uzunluq = 5;
        System.out.println("Sahə: " + d.saheHesabla());
        System.out.println("Perimetr: " + d.perimetrHesabla());
        System.out.println("Kvadratdır: " + d.kvadratmi());
    }
}

class Heyvan {
    String ad;
    int yas;
    String nov;

    void melumatGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Növ: " + nov);
    }
}

class Telebe {
    String ad;
    int sinifNomresi;
    double ortaQiymet;

    void melumat() {
        System.out.println("Ad: " + ad);
        System.out.println("Sinif: " + sinifNomresi);
        System.out.println("Orta qiymət: " + ortaQiymet);
    }

    boolean kechiblimi() {
        return ortaQiymet > 50;
    }
}

class Hesablayici {
    int eded1;
    int eded2;

    int topla() {
        return eded1 + eded2;
    }

    int cix() {
        return eded1 - eded2;
    }

    int vur() {
        return eded1 * eded2;
    }

    double bol() {
        return (double) eded1 / eded2;
    }
}

class Kitab {
    String kitabAdi;
    String muellif;
    int sehifeSayi;
    double qiymet;

    void bilgiGoster() {
        System.out.println("Kitab: " + kitabAdi);
        System.out.println("Müəllif: " + muellif);
        System.out.println("Səhifə sayı: " + sehifeSayi);
        System.out.println("Qiymət: " + qiymet);
    }

    boolean qalinKitabmi() {
        return sehifeSayi > 200;
    }

    double endirimliQiymet(int faiz) {
        return qiymet - (qiymet * faiz / 100.0);
    }
}

class Duzbucaqli {
    double en;
    double uzunluq;

    double saheHesabla() {
        return en * uzunluq;
    }

    double perimetrHesabla() {
        return 2 * (en + uzunluq);
    }

    boolean kvadratmi() {
        return en == uzunluq;
    }
}