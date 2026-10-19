package Lesson45;

public class CinemaMain {
    public static void main(String[] args) throws InterruptedException {
        Cinema cinema = new Cinema();

        Cashier c1 = new Cashier("Kassir 1", cinema);
        Cashier c2 = new Cashier("Kassir 2", cinema);
        Cashier c3 = new Cashier("Kassir 3", cinema);

        c1.start();
        c2.start();
        c3.start();

        c1.join();
        c2.join();
        c3.join();
    }
}