package Lesson45;

public class Cashier extends Thread {
    private Cinema cinema;
    public Cashier(String name, Cinema cinema) {
        super(name);
        this.cinema = cinema;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cinema.sellTicket(getName());
        }
    }
}