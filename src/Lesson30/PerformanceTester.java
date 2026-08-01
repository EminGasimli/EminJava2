package Lesson30;

public class PerformanceTester {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long cem = 0;
        for (int i = 1; i <= 10000000; i++) {
            cem += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Cəm: " + cem);
        System.out.println("Bu kod " + (endTime - startTime) + " millisaniyə ərzində icra olundu.");
        System.out.println("Əməliyyat sistemi: " + System.getProperty("os.name"));
    }
}