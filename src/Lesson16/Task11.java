package Lesson16;

public class Task11 {
    static void main() {
        int[] prices = {10, 25, 30, 15};

        int cem = 0;

        for (int price : prices) {
            cem += price;
        }

        System.out.println("Cəm = " + cem);
    }
}
