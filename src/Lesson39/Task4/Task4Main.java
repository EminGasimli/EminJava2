package Lesson39.Task4;

public class Task4Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Ali", 2000);
        Developer developer = new Developer("Vali", 1500);

        System.out.println("Manager bonus: " + manager.calculateBonus());
        System.out.println("Developer bonus: " + developer.calculateBonus());
    }
}