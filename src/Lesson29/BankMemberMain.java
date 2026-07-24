package Lesson29;

public class BankMemberMain {
    public static void main(String[] args) {
        BankMember member1 = new BankMember("Ali");
        BankMember member2 = new BankMember("Veli");
        member1.deposit(500);
        member2.deposit(300);
        BankMember.showTotalBalance();
    }
}