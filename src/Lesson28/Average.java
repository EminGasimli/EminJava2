package Lesson28;

public class Average {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;
        int count = 0;
        while (i <= 300) {
            if (i % 3 == 0 && i % 7 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        double average = (double) sum / count;
        System.out.println("Ədədi orta = " + average);
    }
}