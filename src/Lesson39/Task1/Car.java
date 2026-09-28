package Lesson39.Task1;

public class Car extends Vehicle implements Movable {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println("Car hərəkət edir. Brand: "
                + getBrand() + ", Speed: " + getSpeed());
    }
}