package Lesson34.Task1;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }
    @Override
    void processPayment() {
        System.out.println("Kredit kartı ilə " + amount +
                " məbləğində ödəniş uğurla keçdi");
    }
}
