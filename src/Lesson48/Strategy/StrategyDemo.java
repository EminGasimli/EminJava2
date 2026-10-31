package Lesson48.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Character character = new Character(new FastRun());

        character.run();

        character.setStrategy(new SlowRun());
        character.run();

        character.setStrategy(new FastRun());
        character.run();
    }
}