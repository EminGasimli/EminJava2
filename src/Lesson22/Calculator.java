package Lesson22;

public class Calculator {
    static int sum(int... numbers) {
        int cem = 0;
        for (int num : numbers) {
            cem += num;
        }
        return cem;
    }
    static int max(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Heç bir ədəd daxil edilməyib.");
            return 0;
        }
        int maksimum = numbers[0];
        for (int num : numbers) {
            if (num > maksimum) {
                maksimum = num;
            }
        }
        return maksimum;
    }
    static double average(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int cem = 0;
        for (int num : numbers) {
            cem += num;
        }
        return (double) cem / numbers.length;
    }
    static void main() {
        System.out.println("Cəm: " + sum(1, 2, 3));
        System.out.println("Maksimum: " + max(4, 7, 2, 9));
        System.out.println("Ortalama: " + average(10, 20, 30));
        System.out.println("\n0 parametr testləri:");
        System.out.println("Cəm: " + sum());
        System.out.println("Maksimum: " + max());
        System.out.println("Ortalama: " + average());
    }
}
