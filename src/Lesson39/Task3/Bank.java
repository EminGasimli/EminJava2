package Lesson39.Task3;

public class Bank implements CreditAble {
    @Override
    public void credit(Person p, double amount) {
        if (p.getSalary() > 500) {
            System.out.println(p.getName() + " " + p.getSurname()
                    + " üçün " + amount + " AZN kredit verildi.");
        }
        else {
            System.out.println("Kredit verilmir. Maaş 500 AZN-dən yuxarı olmalıdır.");
        }
    }

    @Override
    public void specialCredit(Person p, double amount) {

        if (p instanceof Developer) {
            System.out.println(p.getName() + " " + p.getSurname()
                    + " Developer olduğu üçün " + amount
                    + " AZN xüsusi kredit verildi.");
        }
        else {
            System.out.println("Xüsusi kredit yalnız Developer üçün verilir.");
        }
    }
}