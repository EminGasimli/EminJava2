package Lesson34.Task1;

public class Main {
    public static void main(String[] args) {
        Payment cardPayment = new CreditCardPayment(100);
        Payment cashPayment = new CashPayment(50);

        cardPayment.processPayment();
        cashPayment.processPayment();
    }
}
