package Lesson34.Task1;

public abstract class Payment {
    double amount;
    public Payment(double amount) {
        this.amount = amount;
    }
    abstract void processPayment();
}
