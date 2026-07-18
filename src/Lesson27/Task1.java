package Lesson27;

public class Task1 {
    static void geriSay(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        geriSay(n - 1);
    }

    static int faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }

    static int cem(int n) {
        if (n == 1) {
            return 1;
        }
        return n + cem(n - 1);
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int quvvet(int esas, int ust) {
        if (ust == 0) {
            return 1;
        }
        return esas * quvvet(esas, ust - 1);
    }

    static int reqemCemi(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + reqemCemi(n / 10);
    }

    static void tersCevir(String soz) {
        if (soz.length() == 0) {
            return;
        }
        System.out.print(soz.charAt(soz.length() - 1));
        tersCevir(soz.substring(0, soz.length() - 1));
    }

    static int enBoyuk(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        int max = enBoyuk(arr, index - 1);
        if (arr[index] > max) {
            return arr[index];
        }
        else {
            return max;
        }
    }

    public static void main(String[] args) {
        System.out.println("Tapşırıq 1");
        geriSay(5);

        System.out.println("\n\nTapşırıq 2");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "! = " + faktorial(i));
        }

        System.out.println("\nTapşırıq 3");
        System.out.println("Cəm = " + cem(5));

        System.out.println("\nTapşırıq 4");
        for (int i = 0; i <= 15; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n\nTapşırıq 5");
        System.out.println("2^5 = " + quvvet(2, 5));

        System.out.println("\nTapşırıq 6");
        System.out.println("Rəqəmlərin cəmi = " + reqemCemi(1234));

        System.out.println("\nTapşırıq 7");
        tersCevir("Java");

        System.out.println("\n\nTapşırıq 8");
        int[] arr = {12, 45, 7, 89, 34, 56};
        System.out.println("Ən böyük = " + enBoyuk(arr, arr.length - 1));
    }
}