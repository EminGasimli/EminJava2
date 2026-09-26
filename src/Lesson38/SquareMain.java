package Lesson38;
public class SquareMain {
    static double kvadratSahesi(double teref) {
        if (teref < 0) {
            throw new IllegalArgumentException("Kvadratın tərəfi mənfi ola bilməz");
        }
        return teref * teref;
    }
    public static void main(String[] args) {
        try {
            double teref = -5;
            double sahe = kvadratSahesi(teref);
            System.out.println("Kvadratın sahəsi: " + sahe);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
