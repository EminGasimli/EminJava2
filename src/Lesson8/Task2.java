package Lesson8;

public class Task2{
    public static void main() {
        int movcudStok = Integer.MAX_VALUE;
        int yeniGelenMehsul = 100;

        try {
            int netice = Math.addExact(movcudStok, yeniGelenMehsul);
            System.out.println("Nəticə: " + netice);
        } catch (ArithmeticException e) {
            System.out.println("Overflow baş verdi: " + e.getMessage());
        }
    }
}
