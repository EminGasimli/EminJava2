package Lesson23;
public class Task2 {

    public static void main(String[] args) {
        Avtomobil a1 = new Avtomobil();
        a1.marka = "BMW";
        a1.reng = "Qara";
        a1.il = 2022;

        Avtomobil a2 = new Avtomobil();
        a2.marka = "Mercedes";
        a2.reng = "Ağ";
        a2.il = 2023;
        System.out.println("1-ci avtomobil: " + a1.marka + ", " + a1.reng + ", " + a1.il);
        System.out.println("2-ci avtomobil: " + a2.marka + ", " + a2.reng + ", " + a2.il);

        System.out.println("-------------------------");

        Shagird s1 = new Shagird("Aysel", 12, 6);
        Shagird s2 = new Shagird("Murad", 13, 7);
        Shagird s3 = new Shagird("Leyla", 11, 5);
        s1.goster();
        s2.goster();
        s3.goster();

        System.out.println("-------------------------");

        Itci it = new Itci();
        it.ad = "Tarzan";
        it.cins = "Alman Çoban iti";
        it.qacir();
        it.qacir();
        it.yeyir();
        it.qacir();
        it.yatir();

        System.out.println("-------------------------");

        Mehsul m1 = new Mehsul("Alma", 1.5, 5);
        Mehsul m2 = new Mehsul("Çörək", 0.8, 3);
        Mehsul m3 = new Mehsul("Süd", 2.0, 2);
        Mehsul m4 = new Mehsul("Pendir", 5.0, 1);
        m1.melumat();
        m2.melumat();
        m3.melumat();
        m4.melumat();
        double cem = m1.umumiQiymet() + m2.umumiQiymet() + m3.umumiQiymet() + m4.umumiQiymet();
        System.out.println("----------------");
        System.out.println("Ümumi cəm: " + cem + " AZN");

        System.out.println("-------------------------");

        Oyuncu[] oyuncular = {
                new Oyuncu("Əli", 80),
                new Oyuncu("Vəli", 85),
                new Oyuncu("Aysel", 70),
                new Oyuncu("Nigar", 90),
                new Oyuncu("Kamran", 75)
        };
        oyuncular[0].xalArtir(5);
        oyuncular[1].xalArtir(7);
        oyuncular[2].xalArtir(8);
        oyuncular[3].xalArtir(5);
        oyuncular[4].xalArtir(13);
        Oyuncu qalib = oyuncular[0];
        for (Oyuncu o : oyuncular) {
            o.goster();
            if (o.xal > qalib.xal) {
                qalib = o;
            }
        }
        System.out.println("Qalib: " + qalib.ad + " - " + qalib.xal + " xal!");
    }
}

class Avtomobil {
    String marka;
    String reng;
    int il;
}

class Shagird {
    String ad;
    int yas;
    int sinif;
    Shagird(String ad, int yas, int sinif) {
        this.ad = ad;
        this.yas = yas;
        this.sinif = sinif;
    }
    void goster() {
        System.out.println(ad + " - " + yas + " yaş - " + sinif + "-ci sinif");
    }
}

class Itci {
    String ad;
    String cins;
    int enerjisi = 100;
    void qacir() {
        enerjisi -= 20;
        System.out.println(ad + " qaçır! Enerji: " + enerjisi);
    }
    void yeyir() {
        enerjisi += 30;
        System.out.println(ad + " yeyir! Enerji: " + enerjisi);
    }
    void yatir() {
        enerjisi += 50;
        System.out.println(ad + " yatır! Enerji: " + enerjisi);
    }
}

class Mehsul {
    String ad;
    double qiymet;
    int miqdar;
    Mehsul(String ad, double qiymet, int miqdar) {
        this.ad = ad;
        this.qiymet = qiymet;
        this.miqdar = miqdar;
    }
    double umumiQiymet() {
        return qiymet * miqdar;
    }
    void melumat() {
        System.out.println(ad + " - " + qiymet + " AZN x " + miqdar
                + " = " + umumiQiymet() + " AZN");
    }
}

class Oyuncu {
    String ad;
    int xal;
    Oyuncu(String ad, int xal) {
        this.ad = ad;
        this.xal = xal;
    }
    void xalArtir(int elave) {
        xal += elave;
    }
    void goster() {
        System.out.println(ad + ": " + xal + " xal");
    }
}