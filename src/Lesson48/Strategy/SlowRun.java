package Lesson48.Strategy;

public class SlowRun implements RunStrategy {
    @Override
    public void run() {
        System.out.println("Personaj yavas qacir!");
    }
}