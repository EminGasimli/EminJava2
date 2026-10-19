package Lesson45;

public class Cinema {
    private int availableTickets = 10;
    public synchronized void sellTicket(String cashierName) {
        if (availableTickets > 0) {
            availableTickets--;
            System.out.println(cashierName + " bilet satdı. Qalan biletlər: " + availableTickets);
        }
        else {
            System.out.println(cashierName + ": Bilet qalmayıb.");
        }
    }
}