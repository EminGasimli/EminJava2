package Lesson26;

public class Task5 {
    static void celsiusToFahrenheit(double c) {
        double f = c * 9 / 5 + 32;
        System.out.println(c + " C = " + f + " F");
    }

    static void fahrenheitToCelsius(double f) {
        double c = (f - 32) * 5 / 9;
        System.out.println(f + " F = " + c + " C");
    }

    public static void main(String[] args) {
        celsiusToFahrenheit(30);
        fahrenheitToCelsius(86);
    }
}
