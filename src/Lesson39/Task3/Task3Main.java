package Lesson39.Task3;

public class Task3Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Ali", "Aliyev", 1000);
        Teacher teacher = new Teacher("Aysel", "Hasanova", 700);
        Driver driver = new Driver("Murad", "Mammadov", 400);

        Bank bank = new Bank();

        bank.credit(developer, 5000);
        bank.credit(teacher, 3000);
        bank.credit(driver, 2000);

        System.out.println();

        bank.specialCredit(developer, 100000);
        bank.specialCredit(teacher, 100000);
        bank.specialCredit(driver, 100000);
    }
}