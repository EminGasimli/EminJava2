package Lesson35.Task2;

public abstract class Vehicle {
    int speed;
    abstract void start();
    public void stop() {
        System.out.println("Vehicle stopped");
    }
}
