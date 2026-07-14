package Lesson26;

public class Task14 {
    static void qiymetHesabla(double qiymet, int say, double endirim) {
        double cem = qiymet * say;
        double yekun = cem - (cem * endirim / 100);
        System.out.println("Cəm: " + cem);
        System.out.println("Endirim: " + endirim + "%");
        System.out.println("Yekun: " + yekun);
    }

    public static void main(String[] args) {
        qiymetHesabla(50.0, 3, 10);
    }
}
