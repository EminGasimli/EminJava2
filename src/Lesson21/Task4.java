package Lesson21;

public class Task4 {
    static void main() {
        //int
        int[] ededler = {10, 20, 30, 40, 50};

        System.out.println("=== Tam ədədlər massivi ===");
        System.out.println("Birinci element: " + ededler[0]);
        System.out.println("Üçüncü element: " + ededler[2]);
        System.out.println("Beşinci element: " + ededler[4]);

        ededler[1] = 25;
        System.out.println("Dəyişdirilmiş ikinci element: " + ededler[1]);

        //char
        char[] herfler = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("\n=== Simvollar massivi ===");
        System.out.println("Birinci hərf: " + herfler[0]);
        System.out.println("Dördüncü hərf: " + herfler[3]);

        herfler[2] = 'Z';
        System.out.println("Yeni üçüncü hərf: " + herfler[2]);

        //string
        String[] meyveler = {"Alma", "Armud", "Banan"};

        System.out.println("\n=== String massivi ===");
        System.out.println("Birinci meyvə: " + meyveler[0]);
        System.out.println("İkinci meyvə: " + meyveler[1]);

        meyveler[2] = "Portağal";
        System.out.println("Yeni üçüncü meyvə: " + meyveler[2]);

        //for
        System.out.println("\n=== for dövrü ilə int massivi ===");
        for (int i = 0; i < ededler.length; i++) {
            System.out.println("Element " + i + ": " + ededler[i]);
        }

        //for-each
        System.out.println("\n=== for-each dövrü ilə char massivi ===");
        for (char herf : herfler) {
            System.out.println(herf);
        }
    }
}
