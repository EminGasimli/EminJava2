package Lesson33.Task2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " AZN hesaba əlavə edildi.");
        } else {
            System.out.println("Mənfi və ya 0 məbləğ əlavə etmək olmaz!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " AZN hesabdan çıxarıldı.");
        } else {
            System.out.println("Pul çıxarmaq mümkün deyil!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
