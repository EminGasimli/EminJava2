package Lesson34.Task1;

public class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }
    @Override
    void processPayment() {
        System.out.println("Nağd şəkildə " + amount +
                " məbləğində ödəniş qəbul edildi");
    }
}
