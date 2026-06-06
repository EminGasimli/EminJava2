package Lesson16;

public class Task12 {
    static void main() {
        int[] prices = {10, 25, 30, 15, 3, 66, 78, 9, 11, 23};

        int cutCem = 0;
        int tekCem = 0;

        for (int number : prices) {
            if (number % 2 == 0) {
                cutCem += number;
            } else {
                tekCem += number;
            }
        }

        System.out.println("Cüt ədədlərin cəmi = " + cutCem);
        System.out.println("Tək ədədlərin cəmi = " + tekCem);
    }
}
