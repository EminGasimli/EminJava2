package Lesson33.Task2;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("AZ123456", 1000);
        account.deposit(500);
        account.withdraw(300);
        account.deposit(-200);
        System.out.println("Cari balans: " + account.getBalance() + " AZN");
    }
}
