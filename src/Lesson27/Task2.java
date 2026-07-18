package Lesson27;

public class Task2 {

    static void deyis(int x) {
        x = 100;
        System.out.println("Metod icinde: " + x);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void massivDeyis(int[] arr) {
        arr[0] = 999;
    }

    static void nullEt(int[] arr) {
        arr = null;
    }

    static void stringDeyis(String s) {
        s = "Yeni dəyər";
    }

    static class Telebe {
        String ad;
        int yas;
        Telebe(String ad, int yas) {
            this.ad = ad;
            this.yas = yas;
        }
    }

    static void yasArtir(Telebe t) {
        t.yas = t.yas + 1;
    }

    static void telebeNullEt(Telebe t) {
        t = null;
    }

    public static void main(String[] args) {
        System.out.println("Tapşırıq 1");
        int a = 5;
        deyis(a);
        System.out.println("Main-de: " + a);
        // Cavab:
        // Primitive tiplər pass-by-value ilə ötürülür.
        // Metoda yalnız dəyərin kopyası göndərilir.

        // ----------------------------

        System.out.println("\nTapşırıq 2");
        int x = 3;
        int y = 7;
        swap(x, y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // Cavab:
        // Swap metodunda yalnız kopyalar dəyişir.
        // Main-dəki x və y dəyişmir.

        // ----------------------------

        System.out.println("\nTapşırıq 3");
        int[] ededler = {1, 2, 3};
        massivDeyis(ededler);
        System.out.println(ededler[0]);
        // Cavab:
        // Referansın kopyası göndərilir.
        // Hər iki referans eyni massivi göstərdiyi üçün
        // element dəyişir.

        // ----------------------------

        System.out.println("\nTapşırıq 4");
        int[] data = {10, 20, 30};
        nullEt(data);
        System.out.println(data[0]);
        // Cavab:
        // data null olmur.
        // Yalnız metod daxilindəki referans null edilir.

        // ----------------------------

        System.out.println("\nTapşırıq 5");
        String soz = "Kohne";
        stringDeyis(soz);
        System.out.println(soz);
        // Cavab:
        // String immutable-dir.
        // Yeni String yaradılır, köhnə dəyişmir.

        // ----------------------------

        System.out.println("\nTapşırıq 6");
        Telebe t = new Telebe("Ali", 15);
        System.out.println("Evvel: " + t.yas);
        yasArtir(t);
        System.out.println("Sonra: " + t.yas);
        // Cavab:
        // Obyektin sahəsi dəyişir.
        // Massivlə eyni prinsipdir.

        // ----------------------------

        System.out.println("\nTapşırıq 7");

        // 1
        int p = 10;
        System.out.println("1) Evvel int: " + p);
        deyis(p);
        System.out.println("Sonra int: " + p);

        // 2
        int[] arr = {5, 6, 7};
        System.out.println("\n2) Evvel massiv: " + arr[0]);
        massivDeyis(arr);
        System.out.println("Sonra massiv: " + arr[0]);

        // 3
        int[] arr2 = {11, 22, 33};
        System.out.println("\n3) Evvel arr2: " + arr2[0]);
        nullEt(arr2);
        System.out.println("Sonra arr2: " + arr2[0]);

        // 4
        String ad = "Java";
        System.out.println("\n4) Evvel String: " + ad);
        stringDeyis(ad);
        System.out.println("Sonra String: " + ad);

        // 5
        Telebe telebe = new Telebe("Veli", 18);
        System.out.println("\n5) Evvel yas: " + telebe.yas);
        yasArtir(telebe);
        System.out.println("Sonra yas: " + telebe.yas);

        // 6
        System.out.println("\n6) Evvel telebe: " + telebe.ad);
        telebeNullEt(telebe);
        System.out.println("Sonra telebe: " + telebe.ad);

        System.out.println("\nNəticə:");
        System.out.println("Java-da həmişə pass-by-value işləyir.");
        System.out.println("Primitive-lərdə dəyərin kopyası göndərilir.");
        System.out.println("Obyektlərdə isə referansın kopyası göndərilir.");
    }
}
