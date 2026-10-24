package Lesson46;

public class Shopping {
    public void alisVeris(Bank bank, Product product, int say) {
        double total = product.price * say;

        if (say <= 0) {
            System.out.println("Miqdar duzgun deyil!");
        }
        else if (bank.balance >= total) {
            bank.balance -= total;

            System.out.println(product.name + " x " + say + " alindi.");
            System.out.println("Odenilen mebleg: " + total + " AZN");
            System.out.println("Qalan balans: " + bank.balance + " AZN");
        }
        else {
            System.out.println("Balans kifayet deyil!");
        }
    }
}
