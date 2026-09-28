package Lesson39;

public class BankMain {
    static void main() {
        try{
            BankAccount account =  new BankAccount(890.0);
            System.out.println("230 AZN cixarildi");
            account.deposit(230.0);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
