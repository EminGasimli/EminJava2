package Lesson39;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Xeta: cixarmaq istediyiniz mebleq (" + amount + " AZN) olan mebleqden (" + balance + "AZN) artiqdir");
        }
        balance -= amount;
        System.out.println(amount + "AZN pul cixarildi. Qalan pul: " + balance + "AZN");
    }

    public double getBalance() {
        return balance;
    }
}
