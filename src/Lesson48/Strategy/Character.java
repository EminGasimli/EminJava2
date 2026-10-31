package Lesson48.Strategy;

public class Character {
    private RunStrategy strategy;

    public Character(RunStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RunStrategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.run();
    }
}