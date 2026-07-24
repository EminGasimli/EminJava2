package Lesson29;

public class BankMember {
    String memberName;
    static double totalBankBalance = 0;

    public BankMember(String name) {
        this.memberName = name;
    }

    public void deposit(double amount) {
        totalBankBalance += amount;
        System.out.println(memberName + " banka " + amount + " AZN qoydu.");
    }

    public static void showTotalBalance() {
        System.out.println("Bankın ümumi büdcəsi: " + totalBankBalance + " AZN");
    }
}