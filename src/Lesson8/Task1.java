package Lesson8;

public class Task1 {
    public static void main() {

        short result = (short) (Short.MIN_VALUE - 1);

        boolean isLessThanMax = result < Short.MAX_VALUE;

        System.out.println("Result: " + result);
        System.out.println("Short.MAX_VALUE-dən kiçikdirmi? " + isLessThanMax);
    }
}
